package com.happ.happ.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * 717219917@qq.com  2017/5/27 11:28
 */

public class Fragment_Test extends Fragment {
    String flag ;
    @Override public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
        initView();
    }

    private void initView(){

        initData();
    }

    private void initData(){
        loadFlag(flag);
    }

    private void loadFlag(String flag){//业务逻辑

    }


   @Subscribe(threadMode = ThreadMode.MAIN,sticky = true)
   private void reciveFrom_Activity(String str){
       flag=str;
     }



    @Override public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
