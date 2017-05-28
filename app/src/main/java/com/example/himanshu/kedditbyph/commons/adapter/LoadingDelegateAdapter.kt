package com.example.himanshu.kedditbyph.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.himanshu.kedditbyph.R
import com.example.himanshu.kedditbyph.commons.extensions.inflate

/**
 * Created by himanshu on 28/05/17.
 */
class LoadingDelegateAdapter :ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder  = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class TurnsViewHolder(parent :ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.news_item_loading)){

    }
}