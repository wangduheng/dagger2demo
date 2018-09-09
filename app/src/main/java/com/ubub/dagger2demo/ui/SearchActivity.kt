package com.ubub.dagger2demo.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.ubub.dagger2demo.R
import com.ubub.dagger2demo.presenter.SearchPresenter
import com.ubub.dagger2demo.presenter.SearchView
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class SearchActivity : DaggerAppCompatActivity(), SearchView {
    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return fragmentDispatchingAndroidInjector
    }

    override fun onCreateEnd() {
        Log.e("SearchActivity", "onCreateEnd")
    }

    @Inject
    lateinit var fragmentDispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var preseneter: SearchPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        Log.e("SearchActivity", "preseneter:${preseneter.onCreate()}")
        supportFragmentManager.beginTransaction().replace(R.id.container, SearchFragment(), "search").commit()
    }

}
