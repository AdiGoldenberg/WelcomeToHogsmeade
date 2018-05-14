package com.example.adi.welcometohogsmeade;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create an array of attraction items
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>() {{
            add(new Attraction(getResources().getString(R.string.attractions_attraction1_name), getResources().getString(R.string.attractions_attraction1_description), R.drawable.owl_post_office));
            add(new Attraction(getResources().getString(R.string.attractions_attraction2_name), getResources().getString(R.string.attractions_attraction2_description), R.drawable.hogsmeadestation));
            add(new Attraction(getResources().getString(R.string.attractions_attraction3_name), getResources().getString(R.string.attractions_attraction3_description), R.drawable.madam_puddifoots_shop));
            add(new Attraction(getResources().getString(R.string.attractions_attraction4_name), getResources().getString(R.string.attractions_attraction4_description), R.drawable.shriek));
            add(new Attraction(getResources().getString(R.string.attractions_attraction5_name), getResources().getString(R.string.attractions_attraction5_description), R.drawable.hogshead));
            add(new Attraction(getResources().getString(R.string.attractions_attraction6_name), getResources().getString(R.string.attractions_attraction6_description), R.drawable.three_broomsticks));
            add(new Attraction(getResources().getString(R.string.attractions_attraction7_name), getResources().getString(R.string.attractions_attraction7_description), R.drawable.wizarding_wireless_network));
        }};

        // Create an AttractionAdapter, whose data source is the list of attractions
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        // Find the ListView object
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Associate the listView and the adapter
        listView.setAdapter(adapter);

        return rootView;
    }

}
