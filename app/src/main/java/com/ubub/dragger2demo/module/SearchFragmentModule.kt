package com.ubub.dragger2demo.module

import com.ubub.dragger2demo.SearchFragment
import com.ubub.dragger2demo.SearchFragmentView
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