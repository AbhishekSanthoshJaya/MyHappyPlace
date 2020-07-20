package com.aby.tovisit_abhishek_c0769778_android.adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.aby.tovisit_abhishek_c0769778_android.R;
import com.aby.tovisit_abhishek_c0769778_android.database.DatabaseHelperClass;
import com.aby.tovisit_abhishek_c0769778_android.model.Place;

import java.util.List;

public class PlaceAdapter extends ArrayAdapter {

    Context context;
    List<Place> places;
    int layoutResource;
    DatabaseHelperClass mDatabase;

    public PlaceAdapter(@NonNull Context context, int resource, List<Place> places, DatabaseHelperClass mDatabase) {
        super(context, resource, places);
        this.context = context;
        this.places = places;
        this.layoutResource = resource;
        this.mDatabase = mDatabase;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(layoutResource, null);

        TextView tvName = v.findViewById(R.id.name_ID);

        final Place p = places.get(position);
        tvName.setText(p.getName());

        if (p.getVisited())
        {
            ImageView i = v.findViewById(R.id.placeImage);
            i.setImageResource(R.drawable.visitedplace);
            v.setBackgroundColor(Color.rgb(125, 252,116));
        }
        return v;
    }
}
