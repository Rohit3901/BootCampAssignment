package com.mindorks.bootcamp.learndagger.ui

import android.os.Bundle
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.R
import com.mindorks.bootcamp.learndagger.di.component.DaggerActivityComponent
import com.mindorks.bootcamp.learndagger.di.module.ActivityModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel //lateinit tells compiler to initialize it later


    override fun onCreate(savedInstanceState: Bundle?) {
        getDependencies()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvData?.text = viewModel.getSomeData()
        addFragment()
    }

    private fun addFragment() {
        var fragmentManager: FragmentManager = supportFragmentManager
        var fragment: Fragment = HomeFragment()
        fragmentManager.beginTransaction().add(R.id.mainFrame, fragment).commit()
    }

    fun getDependencies() {
        DaggerActivityComponent
                .builder()
                .applicationComponent((applicationContext as MyApplication).applicationComponent) //as is used to typecast objects
                .activityModule(ActivityModule(this))
                .build().inject(this)
    }
}