package com.happ.happ.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.happ.happ.R;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/** 717219917@qq.com  2016/12/14 0:18 */
public class Fragment_My extends Fragment_Base{//wode

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        return view ;
    }

    @Override
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
    }
}