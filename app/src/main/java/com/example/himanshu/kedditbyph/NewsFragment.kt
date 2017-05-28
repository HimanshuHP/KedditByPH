package com.example.himanshu.kedditbyph


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.himanshu.kedditbyph.commons.inflate
import kotlinx.android.synthetic.main.news_fragment.*


/**
 * Created by himanshu on 28/05/17.
 */
class NewsFragment : Fragment() {

    private val newsList by lazy {
        news_list
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.news_fragment)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        newsList.setHasFixedSize(true)
        newsList.layoutManager = LinearLayoutManager(context)
    }
}