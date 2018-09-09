package com.ubub.dagger2demo

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {
    @Inject
    lateinit var sharePre: SharedPreferences

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
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
