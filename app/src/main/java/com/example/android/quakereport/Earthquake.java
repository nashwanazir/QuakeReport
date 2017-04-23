package com.example.android.quakereport;

/**
 * Created by Asus on 4/2/2017.
 */

public class Earthquake {

    private double mag;
    String loc;
    private long mTimeInMilliseconds;

    public Earthquake(double mag, String loc, long mTimeInMilliseconds) {
        this.mag = mag;
        this.loc = loc;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
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
