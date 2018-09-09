package com.ubub.dragger2demo.componet

import com.ubub.dragger2demo.MainActivity
import com.ubub.dragger2demo.SearchActivity
import com.ubub.dragger2demo.module.MainActivityModule
import com.ubub.dragger2demo.module.SearchActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by wangduheng26 on 8/9/2018 AD.
 * wangduheng26@gmail.com
 */
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity


    @ContributesAndroidInjector(modules = [SearchActivityModule::class, FragmentBuilder::class])
    abstract fun bindSearchActivity(): SearchActivity


}