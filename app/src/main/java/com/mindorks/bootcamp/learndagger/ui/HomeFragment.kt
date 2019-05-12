package com.mindorks.bootcamp.learndagger.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.R
import com.mindorks.bootcamp.learndagger.di.component.DaggerFragmentComponent
import com.mindorks.bootcamp.learndagger.di.module.FragmentModule
import javax.inject.Inject

class HomeFragment:Fragment(){

    @Inject
    lateinit var homeViewModel:HomeViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        getDependencies()
        val view =  inflater.inflate(R.layout.fragment_home, container, false)

        return view
    }


    fun getDependencies(){
        DaggerFragmentComponent
                .builder()
                .applicationComponent((activity?.applicationContext as MyApplication).applicationComponent)
                .fragmentModule(FragmentModule(this))
                .build()
                .inject(this)
    }
}