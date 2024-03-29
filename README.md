# FINAL ASSIGNMENT - toVisit_Abhishek_C0769778_android

## PROJECT CONTRIBUTORS

Abhishek Santhosh Jaya

## FUNCTIONALITIES IMPLEMENTED
* The user can see his/her location when trying to add a favorite.
* User can see a list of saved favorite places; the user can find and save any place on the map to his/her favorite places list by long press click on the map.
* If no information is available for a specific location, the date when that location is added as favorite place is shown on the list
* The user can select from different types of map
* The user can find nearby cafés, restaurants, museums, pharmacies and banks. 
* User can select any of the nearby places as favorite place to visit
* User can see the distance and duration between his/her location and the favorite place
* The user can get direction from his/her location to a favorite place
* User can edit a favorite location by dragging a marker to a new location or marking it as visited. 
* Visited locations are displayed as green in a cell and the place image changes to a tick mark.
* All data is stored using SQLite database

## PROJECT SCREENSHOTS
Screenshot | Description
--- | ---
<img src="https://i93.servimg.com/u/f93/18/45/29/87/listof10.png" alt="listfav" width="550" height="500"/> | List of all favorite locations. Data is from previous runs.
<img src="https://i93.servimg.com/u/f93/18/45/29/87/screen10.jpg" alt="userlocation" width="550" height="500"/> | Moving to the map view shows user location. The user can select the map type using the buttons on the bottom.
<img src="https://i93.servimg.com/u/f93/18/45/29/87/hybrid10.jpg" alt="maptype" width="550" height="500"/> | User selected a hybrid map type in this case.
<img src="https://i93.servimg.com/u/f93/18/45/29/87/placin10.jpg" alt="addingmarker" width="550" height="500"/> | Long pressing on the map adds a marker with address info.
<img src="https://i93.servimg.com/u/f93/18/45/29/87/restau10.jpg" alt="nearbyplaces" width="550" height="500"/> | User can get nearby points of interests using the Places API. Custom markers for the locations have been added. In this case, the user has searched for nearby restaurants using the spinner.
<img src="https://i93.servimg.com/u/f93/18/45/29/87/menuwi10.png" alt="menu" width="550" height="500"/> | Clicking on a marker opens a custom menu with the option direction and duration information as well as options for calculating route and adding to favorites.
<img src="https://i93.servimg.com/u/f93/18/45/29/87/distan10.jpg" alt="distance" width="550" height="500"/> | Selecting directions option shows route between the marker and user location.
<img src="https://i93.servimg.com/u/f93/18/45/29/87/swipem10.png" alt="swipe" width="550" height="600"/> | Swiping left displays options to delete or update a location
<img src="https://i93.servimg.com/u/f93/18/45/29/87/update10.png" alt="updatemenu" width="450" height="500"/> | Updating a location and be dragging and changing address or makring it as visited.
<img src="https://i93.servimg.com/u/f93/18/45/29/87/locati10.png" alt="del" width="450" height="500"/> | The location was changed and was visited. Cell color is changed to grreen and image icon is changed to a tick mark.
<img src="https://i93.servimg.com/u/f93/18/45/29/87/delete11.png" alt="del" width="450" height="500"/> | Delete option removes the particular entry.

## REFERENCES
* [stackoverflow.com](https://stackoverflow.com/questions/33357062/how-to-change-design-of-title-and-snippet-above-google-maps-marker) - Adding title and snippet
* [developers.google.com](https://developers.google.com/maps/documentation/android-sdk/marker) - Working with markers in google maps
* [medium.com](https://medium.com/@ujikit/add-icons-to-the-android-application-from-android-studio-ide-cd1af9348749) - Adding icon to an android app
* [developers.google.com](https://developers.google.com/maps/documentation/android-sdk/polygon-tutorial) - Working with polylines and polygons
* [stackoverflow.com](https://stackoverflow.com/questions/21635050/moving-linear-layout-down/34243413) - Working with linear layouts
* [stackoverflow.com](https://stackoverflow.com/questions/4165414/how-to-hide-soft-keyboard-on-android-after-clicking-outside-edittext) - Dismissing keyboard
* [stackoverflow](https://stackoverflow.com/questions/31828721/how-to-draw-a-rectangle-with-rounded-corners-using-xml/31828941) - Creating a custom xml file
* [thetechnocafe.com](http://thetechnocafe.com/how-to-use-room-in-android-all-you-need-to-know-to-get-started/) - Working with room db
* [developers.google.com](https://developer.android.com/training/data-storage/room) - Workign with room db 2
* [stackoverflow.com](https://stackoverflow.com/questions/43113101/creating-markers-with-onclicklistener-that-opens-alertdialog-dynamically) - Opening dialog on marker click

