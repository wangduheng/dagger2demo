package com.ubub.dragger2demo

import android.util.Log
import javax.inject.Inject

/**
 * Created by wangduheng26 on 9/9/2018 AD.
 * wangduheng26@gmail.com
 */
class SearchFragmentPresenter @Inject constructor(val view: SearchFragmentView) {
    fun onActivityCreated() {
        Log.e("SearchFragmentPresenter","onActivityCreated")
        view.onCreateEnd()
    }
}

interface SearchFragmentView {
    fun onCreateEnd()
}