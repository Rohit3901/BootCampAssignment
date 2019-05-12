package com.mindorks.bootcamp.learndagger.di.module

import android.content.Context
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifier.DatabaseInfo
import com.mindorks.bootcamp.learndagger.di.qualifier.NetworkInfo
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule constructor(private val application: MyApplication){

    @ApplicationContext
    @Provides
    fun provideContext():Context = application
    @Provides
    @DatabaseInfo
    fun provideDatabaseName():String = "dummy_db"

    @Provides
    @DatabaseInfo
    fun provideDatabaseVersion():Int = 1

    @Provides
    @NetworkInfo
    fun provideApiKey():String="SOME_API_KEY"

    @Provides
    fun provideNetworkConnected():Boolean=false

}