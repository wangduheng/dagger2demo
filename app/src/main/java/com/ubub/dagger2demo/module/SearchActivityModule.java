package com.ubub.dagger2demo.module;

import com.ubub.dagger2demo.SearchActivity;
import com.ubub.dagger2demo.SearchPresenter;
import com.ubub.dagger2demo.SearchView;

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
