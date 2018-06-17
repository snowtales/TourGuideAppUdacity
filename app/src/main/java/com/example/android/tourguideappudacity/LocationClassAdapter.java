package com.example.android.tourguideappudacity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Анастасия on 17.06.2018.
 */

public class LocationClassAdapter extends ArrayAdapter<LocationClass> {
    public LocationClassAdapter(Context context, ArrayList<LocationClass> locs) {
        super(context, 0, locs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listview_adapter, parent, false);
        }
        LocationClass currentLocation = getItem(position);

        TextView locationNameText = listItemView.findViewById(R.id.location_name);
        locationNameText.setText(currentLocation.getmLocationName());

        TextView descrideLocationText = (listItemView.findViewById(R.id.describe_location));
        descrideLocationText.setText(currentLocation.getmDescribingLocation());

        ImageView imageView = listItemView.findViewById(R.id.image_location);
        imageView.setImageResource(currentLocation.getmSourceImage());

        return listItemView;
    }
}
