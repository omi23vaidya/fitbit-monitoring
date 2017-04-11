package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Omkar Vaidya on 4/10/2017.
 */

public class SleepUltimate {

    public SleepSummary getSummary() {
        return summary;
    }

    public void setSummary(SleepSummary summary) {
        this.summary = summary;
    }

    public List<Sleep> getSleep() {
        return sleep;
    }

    public void setSleep(List<Sleep> sleep) {
        this.sleep = sleep;
    }

    @SerializedName("sleep")
    @Expose
    private List<Sleep> sleep;


    @SerializedName("summary")
    @Expose
    private SleepSummary summary;



}
