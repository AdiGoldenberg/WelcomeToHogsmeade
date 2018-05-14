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
public class ShopsFragment extends Fragment {

    public ShopsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create an array of attraction items
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>() {{
            add(new Attraction(getResources().getString(R.string.shops_attraction1_name), getResources().getString(R.string.shops_attraction1_description), R.drawable.dervish));
            add(new Attraction(getResources().getString(R.string.shops_attraction2_name), getResources().getString(R.string.shops_attraction2_description), R.drawable.gladrags_wizardwear));
            add(new Attraction(getResources().getString(R.string.shops_attraction3_name), getResources().getString(R.string.shops_attraction3_description), R.drawable.honeydukes));
            add(new Attraction(getResources().getString(R.string.shops_attraction4_name), getResources().getString(R.string.shops_attraction4_description), R.drawable.ollivanders));
            add(new Attraction(getResources().getString(R.string.shops_attraction5_name), getResources().getString(R.string.shops_attraction5_description), R.drawable.scrivenshaft));
            add(new Attraction(getResources().getString(R.string.shops_attraction6_name), getResources().getString(R.string.shops_attraction6_description), R.drawable.zonkos));
            add(new Attraction(getResources().getString(R.string.shops_attraction7_name), getResources().getString(R.string.shops_attraction7_description), R.drawable.ceridwens_cauldrons));
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
