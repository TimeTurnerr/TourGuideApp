package com.example.desmond.tourguide;
public class Places {
    private String mName;
    private String mLocation;
    private String mdescription;
    private int mImageResourceId;
    public Places(String Name, String Location,String description, int imageResourceId) {
        mName = Name;
        mLocation = Location;
        mdescription = description;
        mImageResourceId = imageResourceId;
    }
    public String getmName() {
        return mName;
    }
    public String getmLocation() {
        return mLocation;
    }
    public String getmdescription() {
        return mdescription;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
