package com.mindorks.bootcamp.learndagger.di.component;

import android.content.Context;

import com.mindorks.bootcamp.learndagger.di.module.ActivityModule;
import com.mindorks.bootcamp.learndagger.di.qualifier.ActivityContext;
import com.mindorks.bootcamp.learndagger.di.scope.ActivityScope;
import com.mindorks.bootcamp.learndagger.ui.MainActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = {ApplicationComponent.class}, modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(MainActivity activity);

    @ActivityContext
    Context getContext();

}
