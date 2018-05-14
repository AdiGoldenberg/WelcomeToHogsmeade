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
public class ResidentsFragment extends Fragment {

    public ResidentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        // Create an array of attraction items
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>() {{
            add(new Attraction(getResources().getString(R.string.residents_attraction1_name), getResources().getString(R.string.residents_attraction1_description), R.drawable.madam_rosmerta));
            add(new Attraction(getResources().getString(R.string.residents_attraction2_name), getResources().getString(R.string.residents_attraction2_description), R.drawable.aberforth_dumbledore));
            add(new Attraction(getResources().getString(R.string.residents_attraction3_name), getResources().getString(R.string.residents_attraction3_description), R.drawable.madam_puddifoots_shop));
            add(new Attraction(getResources().getString(R.string.residents_attraction4_name), getResources().getString(R.string.residents_attraction4_description), R.drawable.ambrosius_flume));
            add(new Attraction(getResources().getString(R.string.residents_attraction5_name), getResources().getString(R.string.residents_attraction5_description), R.drawable.hogsmead));
            add(new Attraction(getResources().getString(R.string.residents_attraction6_name), getResources().getString(R.string.residents_attraction6_description), R.drawable.hogsmead));
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
