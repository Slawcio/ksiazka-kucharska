package com.example.klaudia.myapplication;

/**
 * Created by Klaudia on 2017-04-09.
 */

//Do ogarnięcia:
//- wspomagania pisowni (słownik/autokorekta?)
//- preferencja kuchni narodowej?
//- wyłączanie profilu
//- diabetycy
//- przewodnik krok po kroku po instrukcji (z głosowym "next step")

public class Ingredient
{
    private double amount;
    private int id;
    private String aisle;
    private String name;
    private String imageURL;
    private String unit;
    private String unitShort;
    private String unitLong;
    private String originalString;
    private String[] metaInformation;


    public Ingredient(int id, String aisle, String imageURL, String name, double amount, String unit, String unitShort, String unitLong, String originalString, String[] metaInformation)
    {
        this.amount = amount;
        this.id = id;
        this.aisle = aisle;
        this.name = name;
        this.imageURL = imageURL;
        this.unit = unit;
        this.unitShort = unitShort;
        this.unitLong = unitLong;
        this.originalString = originalString;
        this.metaInformation = metaInformation;
    }

    public double getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    public String getAisle() {
        return aisle;
    }

    public String getName() {
        return name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getUnit() {
        return unit;
    }

    public String getUnitShort() {
        return unitShort;
    }

    public String getUnitLong() {
        return unitLong;
    }

    public String getOriginalString() {
        return originalString;
    }

    public String[] getMetaInformation() {
        return metaInformation;
    }

}
