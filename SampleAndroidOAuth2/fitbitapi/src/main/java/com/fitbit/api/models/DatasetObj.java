package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Omkar Vaidya on 4/10/2017.
 */

public class DatasetObj {

    @SerializedName("time")
    @Expose
    private String time;

    @SerializedName("value")
    @Expose
    private String value;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
