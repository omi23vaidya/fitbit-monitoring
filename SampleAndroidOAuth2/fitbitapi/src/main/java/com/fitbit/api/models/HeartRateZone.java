package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Omkar Vaidya on 4/10/2017.
 */

public class HeartRateZone {

    @SerializedName("caloriesOut")
    @Expose
    private String caloriesOut;

    @SerializedName("max")
    @Expose
    private String max;

    @SerializedName("min")
    @Expose
    private String min;

    @SerializedName("minutes")
    @Expose
    private String minutes;

    @SerializedName("name")
    @Expose
    private String name;


    public String getCaloriesOut() {
        return caloriesOut;
    }

    public void setCaloriesOut(String caloriesOut) {
        this.caloriesOut = caloriesOut;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
