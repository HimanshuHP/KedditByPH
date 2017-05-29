package com.example.himanshu.kedditbyph.features.news.adapter

import android.support.v7.widget.RecyclerView
import com.example.himanshu.kedditbyph.commons.extensions.getFriendlyTime
import com.example.himanshu.kedditbyph.commons.extensions.inflate
import com.example.himanshu.kedditbyph.commons.extensions.loadImg
import kotlinx.android.synthetic.main.news_item.view.*

/**
 * Created by himanshu on 28/05/17.
 */
class NewsDelegateAdapter : com.example.himanshu.kedditbyph.commons.adapter.ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: android.view.ViewGroup): RecyclerView.ViewHolder {
        return com.example.himanshu.kedditbyph.features.news.adapter.NewsDelegateAdapter.NewsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: com.example.himanshu.kedditbyph.commons.adapter.ViewType) {
        holder as com.example.himanshu.kedditbyph.features.news.adapter.NewsDelegateAdapter.NewsViewHolder
        holder.bind(item as com.example.himanshu.kedditbyph.commons.RedditNewsItem)
    }

    class NewsViewHolder(parent: android.view.ViewGroup) : RecyclerView.ViewHolder(parent.inflate(com.example.himanshu.kedditbyph.R.layout.news_item)) {
        fun bind(item: com.example.himanshu.kedditbyph.commons.RedditNewsItem) = with(itemView) {
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()

        }

    }
}