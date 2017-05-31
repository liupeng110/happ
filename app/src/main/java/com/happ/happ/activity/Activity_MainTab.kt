package com.happ.happ.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager.OnPageChangeListener
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import com.andlib.lp.util.L


import com.happ.happ.R
import com.happ.happ.fragment.Fragment_Charts
import com.happ.happ.fragment.Fragment_My
import com.nineoldandroids.view.ViewPropertyAnimator

import java.util.ArrayList
import kotlinx.android.synthetic.main.activity_main_tab.*


/** 717219917@qq.com  2016/12/14 0:26  */
class Activity_Main_tab : Activity_Base() {//主页面

    private var fragments: ArrayList<Fragment>? = null
    private var textViews: ArrayList<TextView>? = null
    private var line_width: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_tab)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        ViewPropertyAnimator.animate(tab_app).scaleX(1.0f).duration = 0

        fragments = ArrayList<Fragment>()
        fragments!!.add(Fragment_My())
        fragments!!.add(Fragment_Charts())
        fragments!!.add(Fragment_Charts())

        textViews = ArrayList<TextView>()
        textViews!!.add(tab_app)
        textViews!!.add(tab_game)
        textViews!!.add(tab_ceshi)

        line_width = windowManager.defaultDisplay.width / fragments!!.size
        line.layoutParams.width = line_width
        line.requestLayout()

        viewPager.adapter = object : FragmentStatePagerAdapter(supportFragmentManager) {
            override fun getCount(): Int { return fragments!!.size }
            override fun getItem(index: Int): Fragment { return fragments!![index] }
        }

        viewPager.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageSelected(index: Int) { changeState(index) }
            override fun onPageScrolled(index: Int, arg1: Float, offset: Int) {
                val tagerX = (index * line_width + offset / fragments!!.size).toFloat()
                ViewPropertyAnimator.animate(line).translationX(tagerX).duration = 0
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })

        val size = textViews!!.size
        for (curr in 0..size - 1) {
            val temp = curr
            textViews!![temp].setOnClickListener { viewPager.currentItem = temp }
        }

    }

    private fun changeState(index: Int) {
        L.i("当前index:" + index)
        val size = textViews!!.size
        for (curr in 0..size - 1) {
            if (curr == index) {
                L.i("当前index:$index---------------color")
                textViews!![curr].setTextColor(resources.getColor(R.color.green))
                ViewPropertyAnimator.animate(textViews!![curr]).scaleX(1.3f).scaleY(1.3f).duration = 200
            } else {
                L.i("当前index:$index,-----------else")
                textViews!![curr].setTextColor(resources.getColor(R.color.gray_white))
                ViewPropertyAnimator.animate(textViews!![curr]).scaleX(1.0f).scaleY(1.0f).duration = 200
            }
        }

    }


}
