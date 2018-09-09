package com.ubub.dagger2demo.componet

import com.ubub.dagger2demo.ui.SearchFragment
import com.ubub.dagger2demo.module.SearchFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by wangduheng26 on 9/9/2018 AD.
 * wangduheng26@gmail.com
 */
@Module
abstract class FragmentBuilder {

    @ContributesAndroidInjector(modules = [SearchFragmentModule::class])
    abstract fun bindFragment(): SearchFragment
}