package com.example.himanshu.kedditbyph.commons

import com.example.himanshu.kedditbyph.commons.adapter.AdapterConstants
import com.example.himanshu.kedditbyph.commons.adapter.ViewType

/**
 * Created by himanshu on 28/05/17.
 */
data class RedditNewsItem(val author: String, val title: String,
                          val numComments: Int, val created: Long,
                          val thumbnail: String, val url: String) : ViewType {

    override fun getViewType() = AdapterConstants.NEWS
}
