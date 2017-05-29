package com.example.himanshu.kedditbyph.features.news.adapter

import com.example.himanshu.kedditbyph.commons.extensions.getFriendlyTime
import com.example.himanshu.kedditbyph.commons.extensions.inflate

/**
 * Created by himanshu on 28/05/17.
 */
class NewsDelegateAdapter : com.example.himanshu.kedditbyph.commons.adapter.ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: android.view.ViewGroup): android.support.v7.widget.RecyclerView.ViewHolder {
        return com.example.himanshu.kedditbyph.features.news.adapter.NewsDelegateAdapter.NewsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: android.support.v7.widget.RecyclerView.ViewHolder, item: com.example.himanshu.kedditbyph.commons.adapter.ViewType) {
        holder as com.example.himanshu.kedditbyph.features.news.adapter.NewsDelegateAdapter.NewsViewHolder
        holder.bind(item as com.example.himanshu.kedditbyph.commons.RedditNewsItem)
    }

    class NewsViewHolder(parent: android.view.ViewGroup) : android.support.v7.widget.RecyclerView.ViewHolder(parent.inflate(com.example.himanshu.kedditbyph.R.layout.news_item)) {
        fun bind(item: com.example.himanshu.kedditbyph.commons.RedditNewsItem) = with(itemView) {
            kotlinx.android.synthetic.main.news_item.view.img_thumbnail.loadImg(item.thumbnail)
            kotlinx.android.synthetic.main.news_item.view.description.text = item.title
            kotlinx.android.synthetic.main.news_item.view.author.text = item.author
            kotlinx.android.synthetic.main.news_item.view.comments.text = "${item.numComments} comments"
            kotlinx.android.synthetic.main.news_item.view.time.text = item.created.getFriendlyTime()

        }

    }
}