package com.happ.happ.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.happ.happ.R
import com.happ.happ.util.Apo
import com.happ.happ.util.annot.AConstructorProcess
import com.happ.happ.util.annot.AMethod
import com.happ.happ.util.annot.APTAnnotation
import com.happ.happ.util.annot.User
import com.happ.happ.util.refle.ArrayObject
import com.happ.happ.util.thread.char01.AliveOtherThread
import com.happ.happ.util.thread.char02.DeadLock
import kotlinx.android.synthetic.main.activity_main.*
import org.greenrobot.eventbus.EventBus


class Activity_Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_tv.text="kotlin"
        main_tv.setOnClickListener{
            onClick()
        }


    }


    fun onClick(){
        toast("点击kotlin")
        startActivity(Intent(MainActivity@this,  Activity_Main_tab::class.java))
    }


    fun toast(str:String){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }



}
