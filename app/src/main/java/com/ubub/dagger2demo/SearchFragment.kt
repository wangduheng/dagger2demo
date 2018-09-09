package com.ubub.dagger2demo

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject


/**
 * Created by wangduheng26 on 9/9/2018 AD.
 * wangduheng26@gmail.com
 */
class SearchFragment : Fragment(), SearchFragmentView {
    override fun onCreateEnd() {
        Log.e("SearchFragment", "onCreateEnd")
    }

    @Inject
    lateinit var presenter: SearchFragmentPresenter

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        presenter.onActivityCreated()
    }
}