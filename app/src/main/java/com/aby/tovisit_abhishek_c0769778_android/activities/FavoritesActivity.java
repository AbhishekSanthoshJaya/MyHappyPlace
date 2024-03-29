package com.aby.tovisit_abhishek_c0769778_android.activities;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import com.aby.tovisit_abhishek_c0769778_android.R;
import com.aby.tovisit_abhishek_c0769778_android.adapters.PlaceAdapter;
import com.aby.tovisit_abhishek_c0769778_android.database.DatabaseHelperClass;
import com.aby.tovisit_abhishek_c0769778_android.model.Place;
import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;

import java.util.ArrayList;
import java.util.List;

public class FavoritesActivity extends AppCompatActivity {

    DatabaseHelperClass mDatabase;
    SwipeMenuListView listViewPlaces;
    List<Place> placeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        mDatabase = new DatabaseHelperClass(this);
        listViewPlaces = findViewById(R.id.locationList);

        SwipeMenuCreator creator = new SwipeMenuCreator() {

            @Override
            public void create(SwipeMenu menu)
            {
                SwipeMenuItem delete_item = new SwipeMenuItem(getApplicationContext());
                delete_item.setWidth(120);
                delete_item.setBackground(new ColorDrawable(Color.rgb(252,63,63)));
                delete_item.setIcon(R.drawable.bin);
                menu.addMenuItem(delete_item);

                SwipeMenuItem update_item = new SwipeMenuItem(getApplicationContext());
                update_item.setWidth(120);
                update_item.setBackground(new ColorDrawable(Color.rgb(92, 109,
                        250)));
                update_item.setIcon(R.drawable.edit);
                menu.addMenuItem(update_item);
            }
        };

        listViewPlaces.setMenuCreator(creator);
        listViewPlaces.setSwipeDirection(SwipeMenuListView.DIRECTION_LEFT);
        listViewPlaces.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {
                switch(index)
                {
                    case 0:
                        mDatabase.removePlace(placeList.get(position).getId());
                        loadPlaces();
                        break;
                    case 1:
                        Intent editIntent = new Intent(FavoritesActivity.this, MapsActivity.class);
                        editIntent.putExtra("selectedPlace", placeList.get(position));
                        editIntent.putExtra("EDIT", true);
                        startActivity(editIntent);
                        break;
                    default:
                        break;
                }
                return false;
            }
        });

        listViewPlaces.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent mapI = new Intent(FavoritesActivity.this, MapsActivity.class);
                mapI.putExtra("selectedPlace", placeList.get(position));
                startActivity(mapI);
            }
        });
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        loadPlaces();
    }

    public void showMap(View view)
    {
        //Proceed to map to add favorites
        Intent mapIntent = new Intent(this, MapsActivity.class);
        startActivity(mapIntent);
    }

    private void loadPlaces()
    {
        placeList = new ArrayList<>();
        Cursor cursor = mDatabase.getAllPlaces();
        if (cursor.moveToFirst())
        {
            do
            {
                placeList.add(new Place(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2).equals("1"),
                        cursor.getDouble(3),
                        cursor.getDouble(4)
                ));
            }
            while (cursor.moveToNext());
            cursor.close();
            PlaceAdapter adaptor = new PlaceAdapter(this, R.layout.place_cell, placeList, mDatabase);
            listViewPlaces.setAdapter(adaptor);
        }
    }
}
