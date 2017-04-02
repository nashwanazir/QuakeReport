package com.example.android.quakereport;

/**
 * Created by Asus on 4/2/2017.
 */

public class Earthquake {

    String mag;
    String loc;
    String date;

    public Earthquake(String mag, String loc, String date) {
        this.mag = mag;
        this.loc = loc;
        this.date = date;
    }

    public String getMag() {
        return mag;
    }

    public String getLoc() {
        return loc;
    }

    public String getDate() {
        return date;
    }
}
