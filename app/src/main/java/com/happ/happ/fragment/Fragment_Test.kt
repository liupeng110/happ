package com.happ.happ.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import com.happ.happ.R

import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.xutils.view.annotation.ContentView

/**
 * 717219917@qq.com  2017/5/27 11:28
 */
@ContentView(R.layout.activity_main)
class Fragment_Test : Fragment() {
    internal var flag: String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        EventBus.getDefault().register(this)
        initView()
    }

    private fun initView() {

        initData()
    }

    private fun initData() {
        loadFlag(flag)
    }

    private fun loadFlag(flag: String) {//业务逻辑

    }


    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    private fun reciveFrom_Activity(str: String) {
        flag = str
    }


    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }
}
