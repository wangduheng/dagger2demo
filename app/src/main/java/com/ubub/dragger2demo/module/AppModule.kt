package com.ubub.dragger2demo.module

import android.content.Context
import android.content.SharedPreferences
import com.ubub.dragger2demo.AppContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by wangduheng26 on 8/9/2018 AD.
 * wangduheng26@gmail.com
 */
@Module
class AppModule {
    val SP_NAME = "sp_local"

    @Provides
    @Singleton
    fun providerAppContext(app: AppContext) = app.applicationContext

    @Provides
    @Singleton
    fun providerSharedPre(context: Context): SharedPreferences {
        return context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE)
    }
}