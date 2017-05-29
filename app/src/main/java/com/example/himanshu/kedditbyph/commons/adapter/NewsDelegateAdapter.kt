package com.example.himanshu.kedditbyph.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.himanshu.kedditbyph.R
import com.example.himanshu.kedditbyph.commons.RedditNewsItem
import com.example.himanshu.kedditbyph.commons.extensions.getFriendlyTime
import com.example.himanshu.kedditbyph.commons.extensions.inflate
import com.example.himanshu.kedditbyph.commons.extensions.loadImg
import kotlinx.android.synthetic.main.news_item.view.*

/**
 * Created by himanshu on 28/05/17.
 */
class NewsDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return NewsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as NewsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class NewsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.news_item)) {
        fun bind(item: RedditNewsItem) = with(itemView) {
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()

        }

    }
}