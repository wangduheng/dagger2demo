package com.ubub.dagger2demo.componet

import com.ubub.dagger2demo.AppContext
import com.ubub.dagger2demo.module.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by wangduheng26 on 8/9/2018 AD.
 * wangduheng26@gmail.com
 */
@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ActivityBuilder::class, AppModule::class])
interface AppComponent : AndroidInjector<AppContext> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<AppContext>()


//    @Component.Builder
//    interface Builder {
//        @BindsInstance
//        fun application(app: AppContext): Builder
//
//        fun build(): AppComponent
//    }

}