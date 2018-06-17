package com.example.android.tourguideappudacity;

/**
 * Created by Анастасия on 16.06.2018.
 */

public class LocationClass {
    private int mLocationName;
    private int mDescribingLocation;
    private int mSourceImage;

    public LocationClass (int locationName, int describingLocation, int sourceImage){
      mLocationName = locationName;
      mDescribingLocation = describingLocation;
      mSourceImage = sourceImage;
    }
    public int getmLocationName(){return mLocationName;}
    public int getmDescribingLocation(){return mDescribingLocation;}
    public int getmSourceImage(){return mSourceImage;}
}
