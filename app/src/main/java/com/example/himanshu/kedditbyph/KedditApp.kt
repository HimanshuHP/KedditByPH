package com.example.himanshu.kedditbyph

import android.app.Application
import com.example.himanshu.kedditbyph.di.AppModule
import com.example.himanshu.kedditbyph.di.news.DaggerNewsComponent
import com.example.himanshu.kedditbyph.di.news.NewsComponent

/**
 * Created by himanshu on 03/06/17.
 */
class KedditApp : Application(){
    companion object {
        lateinit var newsComponent: NewsComponent
    }

    override fun onCreate() {
        super.onCreate()
        newsComponent = DaggerNewsComponent.builder()
                .appModule(AppModule(this))
                //.newsModule(NewsModule()) Module with empty constructor is implicitly created by dagger.
                .build()
    }
}