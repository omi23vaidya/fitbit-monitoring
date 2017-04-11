package com.fitbit.sampleandroidoauth2.fragments;

import android.content.Loader;
import android.os.Bundle;

import com.fitbit.api.loaders.ResourceLoaderResult;
import com.fitbit.api.models.DailyActivitySummary;
import com.fitbit.api.models.Goals;
import com.fitbit.api.models.SleepUltimate;
import com.fitbit.api.models.Summary;
import com.fitbit.api.services.ActivityService;
import com.fitbit.api.services.SleepService;
import com.fitbit.sampleandroidoauth2.R;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.Iterator;

/**
 * Created by Omkar Vaidya on 4/10/2017.
 */

public class SleepFragment extends InfoFragment<SleepUltimate> {

    @Override
    public int getTitleResourceId() {
        return R.string.sleep;
    }

    @Override
    protected int getLoaderId() {
        return 3;
    }

    @Override
    public Loader<ResourceLoaderResult<SleepUltimate>> onCreateLoader(int id, Bundle args) {
        return SleepService.getSleepLog(getActivity(), new Date());
    }

    @Override
    public void onLoadFinished(Loader<ResourceLoaderResult<SleepUltimate>> loader, ResourceLoaderResult<SleepUltimate> data) {
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

    public void bindActivityData(SleepUltimate sleeplog) {
        StringBuilder stringBuilder = new StringBuilder();
        SleepUltimate log = sleeplog;
        stringBuilder.append("<br/><h2 align=center>");
        int h = log.getSummary().getTotalMinutesAsleep() / 60;
        int m = log.getSummary().getTotalMinutesAsleep() - (h * 60);
        stringBuilder.append(h + " HRS " + "<BR>" + m + " MINS");
        stringBuilder.append("<br/><br/></h2>");
        setMainText(stringBuilder.toString());
    }
}
