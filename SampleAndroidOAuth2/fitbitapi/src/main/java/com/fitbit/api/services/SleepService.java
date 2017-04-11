package com.fitbit.api.services;

import android.app.Activity;
import android.content.Loader;

import com.fitbit.api.exceptions.MissingScopesException;
import com.fitbit.api.exceptions.TokenExpiredException;
import com.fitbit.api.loaders.ResourceLoaderFactory;
import com.fitbit.api.loaders.ResourceLoaderResult;
import com.fitbit.api.models.DailyActivitySummary;
import com.fitbit.api.models.Heartrate;
import com.fitbit.api.models.SleepUltimate;
import com.fitbit.authentication.Scope;

import java.util.Date;

/**
 * Created by Omkar Vaidya on 4/10/2017.
 */

public class SleepService {

    private static final String SLEEP_URL = " https://api.fitbit.com/1.2/user/-/sleep/date/today.json";
    private static final ResourceLoaderFactory<SleepUltimate> USER_SLEEP_LOADER_FACTORY = new ResourceLoaderFactory<>(SLEEP_URL, SleepUltimate.class);

    public static Loader<ResourceLoaderResult<SleepUltimate>> getSleepLog(Activity activityContext, Date date) throws MissingScopesException, TokenExpiredException {
        //return USER_ACTIVITIES_LOADER_FACTORY.newResourceLoader(activityContext, new Scope[]{Scope.activity}, dateFormat.format(date));
        return USER_SLEEP_LOADER_FACTORY.newResourceLoader(activityContext, new Scope[]{Scope.sleep});


    }
}
