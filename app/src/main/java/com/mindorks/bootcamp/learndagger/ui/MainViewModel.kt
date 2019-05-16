package com.mindorks.bootcamp.learndagger.ui

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.scope.ActivityScope
import javax.inject.Inject

//primary constructor
//if annotataion or access modifier is there we have to use constructor
@ActivityScope
class MainViewModel @Inject constructor(private val databaseService: DatabaseService, private val networkService: NetworkService) {


    //single statement function
    fun getSomeData(): String = "${databaseService.getDummyData()} ${networkService.getDummyData()}"

}