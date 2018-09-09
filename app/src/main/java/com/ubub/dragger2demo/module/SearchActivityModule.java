package com.ubub.dragger2demo.module;

import com.ubub.dragger2demo.MainActivity;
import com.ubub.dragger2demo.MainPresenter;
import com.ubub.dragger2demo.MainView;
import com.ubub.dragger2demo.SearchActivity;
import com.ubub.dragger2demo.SearchPresenter;
import com.ubub.dragger2demo.SearchView;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by wangduheng26 on 8/9/2018 AD.
 * wangduheng26@gmail.com
 */
@Module
public abstract  class SearchActivityModule {
    @Provides
    static SearchPresenter providerSearchPresenter(SearchView searchView) {
        return new SearchPresenter(searchView);
    }

    @Binds
    abstract SearchView providerSearchView(SearchActivity searchActivity);
}
