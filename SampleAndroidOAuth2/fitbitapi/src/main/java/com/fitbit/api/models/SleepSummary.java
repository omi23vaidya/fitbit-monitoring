package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Omkar Vaidya on 4/10/2017.
 */

public class SleepSummary {


    @SerializedName("totalMinutesAsleep")
    @Expose
    private Integer totalMinutesAsleep;


    @SerializedName("totalSleepRecords")
    @Expose
    private Integer totalSleepRecords;


    @SerializedName("totalTimeInBed")
    @Expose
    private Integer totalTimeInBed;

    public Integer getTotalMinutesAsleep() {
        return totalMinutesAsleep;
    }

    public void setTotalMinutesAsleep(Integer totalMinutesAsleep) {
        this.totalMinutesAsleep = totalMinutesAsleep;
    }

    public Integer getTotalSleepRecords() {
        return totalSleepRecords;
    }

    public void setTotalSleepRecords(Integer totalSleepRecords) {
        this.totalSleepRecords = totalSleepRecords;
    }

    public Integer getTotalTimeInBed() {
        return totalTimeInBed;
    }

    public void setTotalTimeInBed(Integer totalTimeInBed) {
        this.totalTimeInBed = totalTimeInBed;
    }
}
