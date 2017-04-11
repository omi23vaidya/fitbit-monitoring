package com.fitbit.api.services;

import android.app.Activity;
import android.content.Loader;
import android.util.Log;

import com.fitbit.api.exceptions.MissingScopesException;
import com.fitbit.api.exceptions.TokenExpiredException;
import com.fitbit.api.loaders.ResourceLoaderFactory;
import com.fitbit.api.loaders.ResourceLoaderResult;
import com.fitbit.api.models.Device;
import com.fitbit.api.models.Heartrate;
import com.fitbit.authentication.Scope;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Karan Dalvi on 4/9/2017.
 */

public class HeartService {
    private static Calendar c = Calendar.getInstance();
    private static final int hh = c.get(Calendar.HOUR_OF_DAY);
    private static final int mm = c.get(Calendar.MINUTE) - 20;
    private static final String dateFormat = ((hh < 10 ? "0" : "") + hh) + ":" + ((mm < 10 ? "0" : "") + mm);

    private static final String HEART_URL = "https://api.fitbit.com/1/user/-/activities/heart/date/today/1d/1min/time/" + dateFormat + "/" +  dateFormat + ".json";
    private static final ResourceLoaderFactory<Heartrate> USER_HEART_LOADER_FACTORY = new ResourceLoaderFactory<>(HEART_URL, Heartrate.class);

    private static final DateFormat df = new SimpleDateFormat("HH:mm");

    public static Loader<ResourceLoaderResult<Heartrate>> getUserHeartLoader(Activity activityContext) throws MissingScopesException, TokenExpiredException {
        Log.d("hh",dateFormat);
        return USER_HEART_LOADER_FACTORY.newResourceLoader(activityContext, new Scope[]{Scope.heartrate});
    }
}
