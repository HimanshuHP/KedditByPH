package com.example.himanshu.kedditbyph.api

import retrofit2.Call

/**
 * Created by himanshu on 31/05/17.
 */
interface NewsApi {
    fun getNews(after: String, limit: String): Call<RedditNewsResponse>
}