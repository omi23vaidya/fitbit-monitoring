package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Omkar Vaidya on 4/10/2017.
 */

public class SleepLevelsSummary {


    @SerializedName("asleep")
    @Expose
    private SleepDataSum asleep;


    @SerializedName("awake")
    @Expose
    private SleepDataSum awake;


    @SerializedName("restless")
    @Expose
    private SleepDataSum restless;

    public SleepDataSum getAsleep() {
        return asleep;
    }

    public void setAsleep(SleepDataSum asleep) {
        this.asleep = asleep;
    }

    public SleepDataSum getAwake() {
        return awake;
    }

    public void setAwake(SleepDataSum awake) {
        this.awake = awake;
    }

    public SleepDataSum getRestless() {
        return restless;
    }

    public void setRestless(SleepDataSum restless) {
        this.restless = restless;
    }
}
