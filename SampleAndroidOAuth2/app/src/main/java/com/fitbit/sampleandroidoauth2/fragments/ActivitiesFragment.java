package com.fitbit.sampleandroidoauth2.fragments;


import com.fitbit.api.loaders.ResourceLoaderResult;
import com.fitbit.api.models.DailyActivitySummary;
import com.fitbit.api.models.Goals;
import com.fitbit.api.models.Summary;
import com.fitbit.api.services.ActivityService;
import com.fitbit.sampleandroidoauth2.R;
import com.google.gson.Gson;

import android.content.Loader;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.Iterator;

/**
 * Created by jboggess on 10/17/16.
 */

public class ActivitiesFragment extends InfoFragment<DailyActivitySummary> {

    @Override
    public int getTitleResourceId() {
        return R.string.activity_info;
    }

    @Override
    protected int getLoaderId() {
        return 3;
    }

    @Override
    public Loader<ResourceLoaderResult<DailyActivitySummary>> onCreateLoader(int id, Bundle args) {
        return ActivityService.getDailyActivitySummaryLoader(getActivity(), new Date());
    }

    @Override
    public void onLoadFinished(Loader<ResourceLoaderResult<DailyActivitySummary>> loader, ResourceLoaderResult<DailyActivitySummary> data) {
        super.onLoadFinished(loader, data);
        if (data.isSuccessful()) {
            bindActivityData(data.getResult());
        }
    }

    @Override
    protected void printKeys(StringBuilder stringBuilder, Object object) {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(new Gson().toJson(object));
            Iterator<String> keys = jsonObject.keys();
            stringBuilder.append("&nbsp;&nbsp;&nbsp;&nbsp;<b><h2 align=center>" + jsonObject.get("steps") + "<br>Steps</h2>");
            stringBuilder.append("<br/>");
            stringBuilder.append("&nbsp;&nbsp;&nbsp;&nbsp;<b><h2 align=center>" + jsonObject.get("floors") + "<br>Floors</h2>");
            stringBuilder.append("<br/>");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void bindActivityData(DailyActivitySummary dailyActivitySummary) {
        StringBuilder stringBuilder = new StringBuilder();
        Summary summary = dailyActivitySummary.getSummary();
        Goals goals = dailyActivitySummary.getGoals();
        stringBuilder.append("");
        printKeys(stringBuilder, summary);
        setMainText(stringBuilder.toString());
    }
}
