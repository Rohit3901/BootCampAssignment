package com.mindorks.bootcamp.learndagger

import android.app.Application
import com.mindorks.bootcamp.learndagger.di.component.ApplicationComponent
import javax.inject.Inject

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.component.DaggerActivityComponent
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper

class MyApplication :Application(){
    lateinit var applicationComponent: ApplicationComponent

    @Inject lateinit var networkService: NetworkService
    @Inject lateinit var databaseService: DatabaseService
    @Inject lateinit var networkHelper: NetworkHelper

    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }

    fun getDependencies():Unit {
       DaggerActivityComponent
               .builder()


    }

}