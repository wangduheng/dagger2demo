package com.ubub.dagger2demo.ui

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ubub.dagger2demo.R
import com.ubub.dagger2demo.presenter.MainPresenter
import com.ubub.dagger2demo.presenter.MainView
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), MainView {
    @Inject
    lateinit var sharePre: SharedPreferences

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.startLog()
        tvShow.setOnClickListener {
            Log.e("MainActivity", "sharePre:$sharePre")
            startActivity(Intent(MainActivity@ this, SearchActivity::class.java))
        }
    }

    override fun endLog() {
        Log.e("MainActivity", "endLog")
    }
}
