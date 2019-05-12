package com.mindorks.bootcamp.learndagger.di.component

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.module.FragmentModule
import com.mindorks.bootcamp.learndagger.di.qualifier.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.scope.FragmentScope
import com.mindorks.bootcamp.learndagger.ui.HomeFragment
import dagger.Component

@FragmentScope
@Component(dependencies = [ApplicationComponent::class],modules = [FragmentModule::class])

interface FragmentComponent {

    fun inject( fragment :HomeFragment)
    @ApplicationContext fun getContext():Context
}