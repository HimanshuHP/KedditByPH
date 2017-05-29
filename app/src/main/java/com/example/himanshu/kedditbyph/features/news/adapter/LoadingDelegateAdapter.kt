package com.example.himanshu.kedditbyph.features.news.adapter

import android.support.v7.widget.RecyclerView
import com.example.himanshu.kedditbyph.R
import com.example.himanshu.kedditbyph.commons.extensions.inflate

/**
 * Created by himanshu on 28/05/17.
 */
class LoadingDelegateAdapter : com.example.himanshu.kedditbyph.commons.adapter.ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: android.view.ViewGroup): RecyclerView.ViewHolder = LoadingViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: com.example.himanshu.kedditbyph.commons.adapter.ViewType) {
    }

    class LoadingViewHolder(parent : android.view.ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.news_item_loading)){

    }
}