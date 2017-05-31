package com.happ.happ.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.happ.happ.R
import kotlinx.android.synthetic.main.activity_main.*
import org.greenrobot.eventbus.EventBus

class Activity_Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_tv.text="kotlin"



        fun onClick(){
             var a =0
            EventBus.getDefault().postSticky("标签2"+a)

        }



    }




}
