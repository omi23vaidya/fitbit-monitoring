package com.fitbit.sampleandroidoauth2.fragments;


import com.fitbit.api.loaders.ResourceLoaderResult;
import com.fitbit.api.models.User;
import com.fitbit.api.models.UserContainer;
import com.fitbit.api.services.UserService;
import com.fitbit.sampleandroidoauth2.R;
import com.google.gson.Gson;

import android.content.Loader;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jboggess on 10/17/16.
 */

public class ProfileFragment extends InfoFragment<UserContainer> {

    @Override
    public int getTitleResourceId() {
        return R.string.user_info;
    }

    @Override
    protected int getLoaderId() {
        return 1;
    }

    @Override
    public Loader<ResourceLoaderResult<UserContainer>> onCreateLoader(int id, Bundle args) {
        return UserService.getLoggedInUserLoader(getActivity());
    }

    @Override
    public void onLoadFinished(Loader<ResourceLoaderResult<UserContainer>> loader, ResourceLoaderResult<UserContainer> data) {
        super.onLoadFinished(loader, data);
        if (data.isSuccessful()) {
            bindProfileInfo(data.getResult().getUser());
        }
    }

    @Override
    protected void printKeys(StringBuilder stringBuilder, Object object) {
        JSONObject jsonObject = null;
        StringBuilder myStr = new StringBuilder("");
        try {
            jsonObject = new JSONObject(new Gson().toJson(object));
            ArrayList<String> profileData = new ArrayList<String>(5);
            Iterator<String> keys = jsonObject.keys();
            stringBuilder.append("&nbsp;&nbsp;&nbsp;&nbsp;<b>Name:</b>&nbsp;" + jsonObject.get("fullName").toString() + "<br>");
            stringBuilder.append("&nbsp;&nbsp;&nbsp;&nbsp;<b>Age:</b>&nbsp;" + jsonObject.get("age").toString() + "<br>");
            stringBuilder.append("&nbsp;&nbsp;&nbsp;&nbsp;<b>Gender:</b>&nbsp;" + jsonObject.get("gender").toString() + "<br>");
            stringBuilder.append("&nbsp;&nbsp;&nbsp;&nbsp;<b>Height:</b>&nbsp;" + jsonObject.get("height").toString() + "<br>");
            stringBuilder.append("&nbsp;&nbsp;&nbsp;&nbsp;<b>Avg Daily Steps:</b>&nbsp;" + jsonObject.get("averageDailySteps").toString() + "<br>");
//            while (keys.hasNext()) {
//                String key = keys.next();
//                Object value = jsonObject.get(key);
//                if ((key.equals("age")) || (key.equals("fullName")) || (key.equals("gender"))
//                        || (key.equals("height")) || (key.equals("averageDailySteps"))) {
//                    if (!(value instanceof JSONObject)
//                            && !(value instanceof JSONArray)) {
//                        myStr.append("&nbsp;&nbsp;&nbsp;&nbsp;<b>");
//                        myStr.append(key);
//                        myStr.append(":</b>&nbsp;");
//
//                        if (value instanceof Number) {
//                            myStr.append(formatNumber((Number) value));
//                        } else if (isImageUrl(value.toString())) {
//                            myStr.append("<br/>");
//                            myStr.append("<center><img src=\"");
//                            myStr.append(value.toString());
//                            myStr.append("\" width=\"150\" height=\"150\"></center>");
//                        } else {
//                            myStr.append(value.toString());
//                        }
//                        myStr.append("<br/>");
//                    }
//                }
//            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void bindProfileInfo(User user) {
        StringBuilder stringBuilder = new StringBuilder();
        printKeys(stringBuilder, user);
        setMainText(stringBuilder.toString());
    }


}
