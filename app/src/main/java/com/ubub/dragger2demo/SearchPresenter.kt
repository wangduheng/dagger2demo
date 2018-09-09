package com.ubub.dragger2demo

/**
 * Created by wangduheng26 on 8/9/2018 AD.
 * wangduheng26@gmail.com
 */
class SearchPresenter(val searchView: SearchView) {
    fun onCreate() {
        searchView.onCreateEnd()
    }
}

interface SearchView {
    fun onCreateEnd()

}
