package com.mindorks.bootcamp.learndagger.utils;

import android.content.Context;

import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class NetworkHelper {
    // Should be Application Context

    @Inject
    public NetworkHelper(@ApplicationContext Context context,Boolean network ) {

    }

    public boolean isNetworkConnected() {
// will check for network connectivity
        return false;
    }
}
