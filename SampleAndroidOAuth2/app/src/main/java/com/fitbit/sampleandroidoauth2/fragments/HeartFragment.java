package com.fitbit.sampleandroidoauth2.fragments;

import android.content.Loader;
import android.os.Bundle;
import android.util.Log;

import com.fitbit.api.loaders.ResourceLoaderResult;
import com.fitbit.api.models.ActivitiesHeart;
import com.fitbit.api.models.Device;
import com.fitbit.api.models.Heartrate;
import com.fitbit.api.services.DeviceService;
import com.fitbit.api.services.HeartService;
import com.fitbit.sampleandroidoauth2.R;

/**
 * Created by Omkar Vaidya on 4/9/2017.
 */

public class HeartFragment extends InfoFragment<Heartrate> {

    @Override
    public int getTitleResourceId() {
        return R.string.heartbeat;
    }

    @Override
    protected int getLoaderId() {
        return 2;
    }

    @Override
    public Loader<ResourceLoaderResult<Heartrate>> onCreateLoader(int id, Bundle args) {
        return HeartService.getUserHeartLoader(getActivity());
    }

    @Override
    public void onLoadFinished(Loader<ResourceLoaderResult<Heartrate>> loader, ResourceLoaderResult<Heartrate> data) {
        super.onLoadFinished(loader, data);
        if (data.isSuccessful()) {
            bindDevices(data.getResult());
        }
    }

    public void bindDevices(Heartrate heartrate) {
        StringBuilder stringBuilder = new StringBuilder("<br/><h2 align=center>");
      //  Log.d("heartfragmenterror" , String.valueOf(heartrate.getActivities_heart_intraday().getDataset()));

            if (heartrate.getActivities_heart_intraday().getDataset().size() > 0)
                stringBuilder.append(heartrate.getActivities_heart_intraday().getDataset().get(0).getValue());
            else
                stringBuilder.append("--");
            stringBuilder.append("<br/>BPM</h2><br/>");

//        // temporary solution
//        catch (NullPointerException e){
//            stringBuilder.append("68");
//            stringBuilder.append("<br/>BPM</h2><br/>");
//        }
//        if (stringBuilder.length() > 0) {
//            stringBuilder.replace(stringBuilder.length() - 8, stringBuilder.length(), "");
//        }

        setMainText(stringBuilder.toString());
    }

}
