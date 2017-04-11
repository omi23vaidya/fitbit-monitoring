package com.fitbit.api.models;

/**
 * Created by Omkar Vaidya on 4/9/2017.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Heartrate {

    @SerializedName("activities-heart")
    @Expose
    private List<ActivitiesHeart> activities_heart;

    @SerializedName("activities-heart-intraday")
    @Expose
    private ActivitiesHeartIntraday activities_heart_intraday;


    public List<ActivitiesHeart> getActivities_heart() {
        return activities_heart;
    }

    public void setActivities_heart(List<ActivitiesHeart> activities_heart) {
        this.activities_heart = activities_heart;
    }

    public ActivitiesHeartIntraday getActivities_heart_intraday() {
        return activities_heart_intraday;
    }

    public void setActivities_heart_intraday(ActivitiesHeartIntraday activities_heart_intraday) {
        this.activities_heart_intraday = activities_heart_intraday;
    }
}
