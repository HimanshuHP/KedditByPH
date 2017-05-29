package com.example.himanshu.kedditbyph.features.news.adapter

import com.example.himanshu.kedditbyph.commons.extensions.inflate

/**
 * Created by himanshu on 28/05/17.
 */
class LoadingDelegateAdapter : com.example.himanshu.kedditbyph.commons.adapter.ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: android.view.ViewGroup): android.support.v7.widget.RecyclerView.ViewHolder = com.example.himanshu.kedditbyph.features.news.adapter.LoadingDelegateAdapter.LoadingViewHolder(parent)

    override fun onBindViewHolder(holder: android.support.v7.widget.RecyclerView.ViewHolder, item: com.example.himanshu.kedditbyph.commons.adapter.ViewType) {
    }

    class LoadingViewHolder(parent : android.view.ViewGroup) : android.support.v7.widget.RecyclerView.ViewHolder(parent.inflate(com.example.himanshu.kedditbyph.R.layout.news_item_loading)){

    }
}