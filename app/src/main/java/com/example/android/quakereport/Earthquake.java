package com.example.android.quakereport;

/**
 * Created by Asus on 4/2/2017.
 */

public class Earthquake {

    private double mag;
    String loc;

    public String getUrl() {
        return url;
    }

    private long mTimeInMilliseconds;
    String url;

    public Earthquake(double mag, String loc, long mTimeInMilliseconds,String url) {
        this.mag = mag;
        this.loc = loc;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.url=url;
    }

    public double getMag() {
        return mag;
    }

    public String getLoc() {
        return loc;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
