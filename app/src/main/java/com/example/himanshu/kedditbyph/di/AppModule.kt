package com.example.himanshu.kedditbyph.di

import android.content.Context
import com.example.himanshu.kedditbyph.KedditApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by himanshu on 03/06/17.
 */
@Module
class AppModule(val app : KedditApp) {
    @Provides
    @Singleton
    fun getContext() : Context = app

    @Provides
    @Singleton
    fun getApplication() : KedditApp = app
}