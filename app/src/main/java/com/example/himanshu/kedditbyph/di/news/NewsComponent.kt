package com.example.himanshu.kedditbyph.di.news

import com.example.himanshu.kedditbyph.di.AppModule
import com.example.himanshu.kedditbyph.di.NetworkModule
import com.example.himanshu.kedditbyph.features.news.NewsFragment
import dagger.Component
import javax.inject.Singleton

/**
 * Created by himanshu on 03/06/17.
 */
@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        NewsModule::class,
        NetworkModule::class)
)
interface NewsComponent {

    fun inject(newsFragment: NewsFragment)

}