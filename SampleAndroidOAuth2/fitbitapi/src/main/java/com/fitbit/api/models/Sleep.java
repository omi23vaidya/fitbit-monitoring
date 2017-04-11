package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Omkar Vaidya on 4/10/2017.
 */

public class Sleep {
    @SerializedName("dateOfSleep")
    @Expose
    private String dateOfSleep;

    @SerializedName("duration")
    @Expose
    private Long duration;

    @SerializedName("efficiency")
    @Expose
    private Integer efficiency;

    @SerializedName("isMainSleep")
    @Expose
    private Boolean isMainSleep;

    @SerializedName("levels")
    @Expose
    private SleepLevels levels;

    @SerializedName("logId")
    @Expose
    private Long logId;


    @SerializedName("minutesAfterWakeup")
    @Expose
    private Integer minutesAfterWakeup;


    @SerializedName("minutesAsleep")
    @Expose
    private Integer minutesAsleep;


    @SerializedName("minutesAwake")
    @Expose
    private Integer minutesAwake;


    @SerializedName("minutesToFallAsleep")
    @Expose
    private Integer minutesToFallAsleep;

    @SerializedName("startTime")
    @Expose
    private String startTime;

    @SerializedName("timeInBed")
    @Expose
    private Integer timeInBed;

    @SerializedName("type")
    @Expose
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDateOfSleep() {
        return dateOfSleep;
    }

    public void setDateOfSleep(String dateOfSleep) {
        this.dateOfSleep = dateOfSleep;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Integer getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Integer efficiency) {
        this.efficiency = efficiency;
    }

    public Boolean getMainSleep() {
        return isMainSleep;
    }

    public void setMainSleep(Boolean mainSleep) {
        isMainSleep = mainSleep;
    }

    public SleepLevels getLevels() {
        return levels;
    }

    public void setLevels(SleepLevels levels) {
        this.levels = levels;
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Integer getMinutesAfterWakeup() {
        return minutesAfterWakeup;
    }

    public void setMinutesAfterWakeup(Integer minutesAfterWakeup) {
        this.minutesAfterWakeup = minutesAfterWakeup;
    }

    public Integer getMinutesAsleep() {
        return minutesAsleep;
    }

    public void setMinutesAsleep(Integer minutesAsleep) {
        this.minutesAsleep = minutesAsleep;
    }

    public Integer getMinutesAwake() {
        return minutesAwake;
    }

    public void setMinutesAwake(Integer minutesAwake) {
        this.minutesAwake = minutesAwake;
    }

    public Integer getMinutesToFallAsleep() {
        return minutesToFallAsleep;
    }

    public void setMinutesToFallAsleep(Integer minutesToFallAsleep) {
        this.minutesToFallAsleep = minutesToFallAsleep;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Integer getTimeInBed() {
        return timeInBed;
    }

    public void setTimeInBed(Integer timeInBed) {
        this.timeInBed = timeInBed;
    }
}
