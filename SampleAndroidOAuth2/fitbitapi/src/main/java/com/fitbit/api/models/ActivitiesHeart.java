package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Omkar Vaidya on 4/10/2017.
 */

public class ActivitiesHeart {

    @SerializedName("customerHeartRateZones")
    @Expose
    private List<HeartRateZone> customeHeartRateZones;

    @SerializedName("dateTime")
    @Expose
    private String dateTime;

    @SerializedName("heartRateZones")
    @Expose
    private List<HeartRateZone> heartRateZones;

    @SerializedName("value")
    @Expose
    private String value;

    public List<HeartRateZone> getCustomeHeartRateZones() {
        return customeHeartRateZones;
    }

    public void setCustomeHeartRateZones(List<HeartRateZone> customeHeartRateZones) {
        this.customeHeartRateZones = customeHeartRateZones;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public List<HeartRateZone> getHeartRateZones() {
        return heartRateZones;
    }

    public void setHeartRateZones(List<HeartRateZone> heartRateZones) {
        this.heartRateZones = heartRateZones;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
