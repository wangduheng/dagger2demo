package com.ubub.dagger2demo.module

import com.ubub.dagger2demo.ui.SearchFragment
import com.ubub.dagger2demo.presenter.SearchFragmentView
import dagger.Module
import dagger.Provides

/**
 * Created by wangduheng26 on 9/9/2018 AD.
 * wangduheng26@gmail.com
 */
@Module
class SearchFragmentModule {

    @Provides
    fun providerSearchFragmentView(fragment: SearchFragment): SearchFragmentView {
        return fragment
    }
}