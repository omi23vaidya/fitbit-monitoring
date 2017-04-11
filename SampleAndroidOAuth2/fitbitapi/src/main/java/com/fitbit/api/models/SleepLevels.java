package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Omkar Vaidya on 4/10/2017.
 */

public class SleepLevels {


    @SerializedName("data")
    @Expose
    private List<Data> data;


    @SerializedName("summary")
    @Expose
    private SleepLevelsSummary summary;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public SleepLevelsSummary getSummary() {
        return summary;
    }

    public void setSummary(SleepLevelsSummary summary) {
        this.summary = summary;
    }
}
