package com.example.himanshu.kedditbyph.di.news

import com.example.himanshu.kedditbyph.api.NewsApi
import com.example.himanshu.kedditbyph.api.NewsRestAPI
import com.example.himanshu.kedditbyph.api.RedditApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by himanshu on 03/06/17.
 */
@Module
class NewsModule {

    @Provides
    @Singleton
    fun provideNewsAPI(redditApi: RedditApi): NewsApi {
        return NewsRestAPI(redditApi)
    }

    @Provides
    @Singleton
    fun provideRedditApi(retrofit: Retrofit): RedditApi {
        return retrofit.create(RedditApi::class.java)
    }
}