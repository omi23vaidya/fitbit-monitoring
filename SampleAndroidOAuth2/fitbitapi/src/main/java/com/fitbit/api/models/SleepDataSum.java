package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Omkar Vaidya on 4/10/2017.
 */

public class SleepDataSum {


    @SerializedName("count")
    @Expose
    private Integer count;


    @SerializedName("minutes")
    @Expose
    private Integer minutes;


    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }
}
