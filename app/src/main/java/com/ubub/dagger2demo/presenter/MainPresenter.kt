package com.ubub.dagger2demo.presenter

import android.util.Log


/**
 * Created by wangduheng26 on 8/9/2018 AD.
 * wangduheng26@gmail.com
 */
class MainPresenter(val mainView: MainView) {

    fun startLog() {
        Log.e("MainPresenter", "startLog");
        mainView.endLog()

    }
}

interface MainView {
    fun endLog()
}