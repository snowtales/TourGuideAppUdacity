package com.example.android.tourguideappudacity;


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
public class MusemsFragment extends Fragment {
    public MusemsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        final ArrayList<LocationClass> travel = new ArrayList<>();
        travel.add(new LocationClass(R.string.mu_hermitage, R.string.mu_hermitage_desc, R.drawable.hermitage));
        travel.add(new LocationClass(R.string.mu_tretyakovka, R.string.mu_tretyakovka_desc, R.drawable.tretyakovka));
        travel.add(new LocationClass(R.string.mu_armory, R.string.mu_armory_desc, R.drawable.oryjeinaya));
        travel.add(new LocationClass(R.string.mu_diamond, R.string.mu_diamond_desc, R.drawable.diamondfund));
        travel.add(new LocationClass(R.string.mu_grand, R.string.mu_grand_desc, R.drawable.grandmaket));
        LocationClassAdapter adapter = new LocationClassAdapter(getActivity(), travel);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
