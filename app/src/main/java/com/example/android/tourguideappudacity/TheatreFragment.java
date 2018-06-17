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
public class TheatreFragment extends Fragment {
    public TheatreFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        final ArrayList<LocationClass> travel = new ArrayList<>();
        travel.add(new LocationClass(R.string.the_Bolshoi, R.string.the_Bolshoi_dec, R.drawable.bolshoi));
        travel.add(new LocationClass(R.string.the_Mariinsky, R.string.the_Mariinsky_dec, R.drawable.mariinskiy));
        travel.add(new LocationClass(R.string.the_MAT, R.string.the_MAT_dec, R.drawable.mat));
        LocationClassAdapter adapter = new LocationClassAdapter(getActivity(), travel);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
