package com.mindorks.bootcamp.learndagger.ui;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.R;
import com.mindorks.bootcamp.learndagger.di.component.DaggerFragmentComponent;
import com.mindorks.bootcamp.learndagger.di.module.FragmentModule;


import javax.inject.Inject;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    @Inject
    HomeViewModel homeViewModel;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        DaggerFragmentComponent
                .builder()
                .applicationComponent(((MyApplication)getActivity().getApplication()).applicationComponent)
                .fragmentModule(new FragmentModule(this))
                .build()
                .inject(HomeFragment.this);

        TextView textView = view.findViewById(R.id.fragText);
        try {
            textView.setText(homeViewModel.getHomeData());
        }
        catch (Exception e){

        }

        return view;
    }



}
