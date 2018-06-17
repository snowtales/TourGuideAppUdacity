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
public class BarsFragment extends Fragment {

    public BarsFragment() {    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view_layout, container, false);
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        final ArrayList<LocationClass> travel = new ArrayList<>();
        travel.add(new LocationClass(R.string.bar_we, R.string.bar_we_dec, R.drawable.we_pub));
        travel.add(new LocationClass(R.string.bar_bandit, R.string.bar_bandit_dec, R.drawable.los_bandit));
        LocationClassAdapter adapter = new LocationClassAdapter(getActivity(), travel);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
