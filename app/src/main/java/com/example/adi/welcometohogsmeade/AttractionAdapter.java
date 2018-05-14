package com.example.adi.welcometohogsmeade;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ADI on 08/05/2018.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    /**
     * This is a custom constructor. The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        the activity context
     * @param attractionList an ArrayList array with Attraction as the stored objects
     */
    public AttractionAdapter(Activity context, ArrayList<Attraction> attractionList) {
        // Initializing the ArrayAdapter's internal storage for the context and the list.
        super(context, 0, attractionList);
    }

    /**
     * This override returns a view for an AdapterView
     *
     * @param position    Index of position the Attraction in the ListArray that should be displayed.
     * @param convertView The recycled view to alter.
     * @param parent      The parent ViewGroup used for inflation.
     * @return The View for the next position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Word object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout where the attraction name should go to
        TextView attractionTextView = (TextView) convertView.findViewById(R.id.attraction_text);
        // Get the attraction name from the current Attraction object and set this text on the attractionTextView
        attractionTextView.setText(currentAttraction.getAttractionName());

        // Find the TextView in the list_item.xml layout where the attraction description should go
        TextView descriptionTextView = (TextView) convertView.findViewById(R.id.description_text);
        // Get the attraction description from the current Attraction object and set this text on the descriptionTextView
        descriptionTextView.setText(currentAttraction.getAttractionDescription());

        // Find the ImageView in the list_item.xml layout where the image should go
        ImageView imageView = (ImageView) convertView.findViewById(R.id.attraction_image);
        // Get the resource id of the corresponding image from the current Word object
        if (currentAttraction.getAttractionImageId() != 0) {  // set this to be the presented image if it exists
            imageView.setImageResource(currentAttraction.getAttractionImageId());
            imageView.setVisibility(View.VISIBLE);
        } else {    // if there is no image, make the imageView invisible
            imageView.setVisibility(View.GONE);
        }

        // Return the list item layout
        return convertView;
    }
}
