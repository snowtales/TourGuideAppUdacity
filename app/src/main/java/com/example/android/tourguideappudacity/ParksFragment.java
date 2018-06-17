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
public class ParksFragment extends Fragment {
    public ParksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        final ArrayList<LocationClass> travel = new ArrayList<>();
        travel.add(new LocationClass(R.string.pa_Gorky, R.string.pa_Gorky_dec, R.drawable.gorkiy));
        travel.add(new LocationClass(R.string.pa_Botanical, R.string.pa_Botanical_dec, R.drawable.botan));
        travel.add(new LocationClass(R.string.pa_Patriarch, R.string.pa_Patriarch_dec, R.drawable.patriks));
        travel.add(new LocationClass(R.string.pa_Zaryade, R.string.pa_Zaryade_dec, R.drawable.zaryad));
        LocationClassAdapter adapter = new LocationClassAdapter(getActivity(), travel);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
