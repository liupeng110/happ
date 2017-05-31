package com.happ.happ.fragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import org.xutils.x

/**
 * 717219917@qq.com  2017/5/31 15:10
 */

class Fragment_Base : Fragment() {

    private var injected = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle): View? {
        injected = true
        return x.view().inject(this, inflater, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (!injected) {
            x.view().inject(this, this.view)
        }
    }
}
