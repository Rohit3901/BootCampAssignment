package com.mindorks.bootcamp.learndagger.di.module;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.mindorks.bootcamp.learndagger.di.qualifier.FragmentContext;

import dagger.Module;
import dagger.Provides;

@Module
public class FragmentModule {

    private Fragment fragment;

    public FragmentModule(Fragment fragment){
        this.fragment=fragment;
    }

    @FragmentContext
    @Provides
    Context provideContext(){
        return fragment.getContext();
    }
}
