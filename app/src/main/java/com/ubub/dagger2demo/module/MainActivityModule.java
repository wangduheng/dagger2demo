package com.ubub.dagger2demo.module;

import com.ubub.dagger2demo.ui.MainActivity;
import com.ubub.dagger2demo.presenter.MainPresenter;
import com.ubub.dagger2demo.presenter.MainView;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by wangduheng26 on 8/9/2018 AD.
 * wangduheng26@gmail.com
 */
@Module
public abstract class MainActivityModule {
    @Provides
    static MainPresenter providerMainPresenter(MainView mainview) {
        return new MainPresenter(mainview);
    }

    @Binds
    abstract MainView providerMainView(MainActivity mainActivity);
}
