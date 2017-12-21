package se.sugarest.jane.lisbon;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jane on 17-12-21.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    private static final String LOG_TAG = PlaceAdapter.class.getSimpleName();

    /**
     * This is my own constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param place   A list of place objects to display in a list.
     */
    public PlaceAdapter(Activity context, ArrayList<Place> place) {

        /**
         * Here, I initialize the ArrayAdapter's internal storage for the context and the list.
         * The second argument is used when the ArrayAdapter is populating a single TextView.
         * Because this is a custom adapter for three TextViews, the adapter is not going to use this second argument, so it can be any value.
         * Here, I used 0.
         */
        super(context, 0, place);
    }

    /**
     * Provides a view for an AdapterView.
     *
     * @param position    The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The view for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Place object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place_name_textview
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name_textview);

        // Get the name of the place from the current Place object and set this text on the name TextView
        nameTextView.setText(currentPlace.getPlaceName());

        // Find the TextView in the list_item.xml layout with the ID place_short_description_textview
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.place_short_description_textview);

        // Get the short description of the place from the current Place object and set this text on the description TextView
        descriptionTextView.setText(currentPlace.getShortDescription());

        // Find the TextView in the list_item.xml layout with the ID website_textview
        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website_textview);

        // Get the webstie of the place from the current Place object and set this text on the website TextView
        websiteTextView.setText(currentPlace.getWebsite());

        // Find the ImageView in the list_item.xml layout with the ID list_item_background
        ImageView backgroundView = (ImageView) listItemView.findViewById(R.id.list_item_background);

        // Get the image resource ID from the current Place object and set the image to background View
        backgroundView.setImageResource(currentPlace.getImageResourceId());

        return listItemView;
    }
}

