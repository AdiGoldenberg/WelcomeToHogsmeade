package com.example.adi.welcometohogsmeade;

/**
 * Created by ADI on 08/05/2018.
 */

public class Attraction {
    // States
    private String mAttractionName;
    private String mAttractionDescription;
    private int mAttractionImageId;

    // Constructor for attractions without images
    public Attraction(String attractionName, String attractionDescription) {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
    }

    // Constructor for attractions with images
    public Attraction(String attractionName, String attractionDescription, int attractionImageId) {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mAttractionImageId = attractionImageId;
    }

    // Get Methods
    public String getAttractionName() {
        return mAttractionName;
    }

    public String getAttractionDescription() {
        return mAttractionDescription;
    }

    public int getAttractionImageId() {
        return mAttractionImageId;
    }
}
