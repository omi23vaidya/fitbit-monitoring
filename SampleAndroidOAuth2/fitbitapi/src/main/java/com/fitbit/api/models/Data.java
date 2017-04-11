package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Omkar Vaidya on 4/10/2017.
 */

public class Data {


    @SerializedName("dateTime")
    @Expose
    private String dateTime;


    @SerializedName("level")
    @Expose
    private String level;


    @SerializedName("seconds")
    @Expose
    private Integer seconds;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }
}
