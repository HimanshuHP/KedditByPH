package com.example.himanshu.kedditbyph.features.news


import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.himanshu.kedditbyph.R
import com.example.himanshu.kedditbyph.commons.InfiniteScrollListener
import com.example.himanshu.kedditbyph.commons.RedditNews
import com.example.himanshu.kedditbyph.commons.RxBaseFragment
import com.example.himanshu.kedditbyph.commons.extensions.inflate
import com.example.himanshu.kedditbyph.features.news.adapter.NewsAdapter
import kotlinx.android.synthetic.main.news_fragment.*
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


/**
 * Created by himanshu on 28/05/17.
 */
class NewsFragment : RxBaseFragment() {

    private val newsManager by lazy { NewsManager() }
    private var redditNews : RedditNews? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.news_fragment)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        news_list.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(context)
        news_list.layoutManager = linearLayoutManager
        news_list.clearOnScrollListeners()
        news_list.addOnScrollListener(InfiniteScrollListener({ requestNews() }, linearLayoutManager))
        initAdapter()
        if (savedInstanceState == null)
            requestNews()
    }

    private fun requestNews() {
        val subscription = newsManager.getNews(redditNews?.after ?: "")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { retrievedNews ->
                            redditNews = retrievedNews
                            (news_list.adapter as NewsAdapter).addNews(retrievedNews.news)
                        }, { e ->
                    Snackbar.make(news_list, e.message ?: "", Snackbar.LENGTH_LONG).show()
                }
                )
        subscriptions.add(subscription)
    }

    private fun initAdapter() {
        if (news_list.adapter == null)
            news_list.adapter = NewsAdapter()
    }
}