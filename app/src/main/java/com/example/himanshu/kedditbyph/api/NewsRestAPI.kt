package com.example.himanshu.kedditbyph.api

import retrofit2.Call
import javax.inject.Inject

/**
 * Created by himanshu on 30/05/17.
 */
class NewsRestAPI @Inject constructor(private val redditApi: RedditApi) : NewsApi{

    override fun getNews(after: String, limit: String): Call<RedditNewsResponse> {
        return redditApi.getTop(after, limit)
    }

}