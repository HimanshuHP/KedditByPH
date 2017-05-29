package com.example.himanshu.kedditbyph.commons

import android.support.v4.app.Fragment
import rx.subscriptions.CompositeSubscription

/**
 * Created by himanshu on 29/05/17.
 */
open class RxBaseFragment : Fragment() {
    protected var subscriptions = CompositeSubscription()

    override fun onResume() {
        super.onResume()
        subscriptions = CompositeSubscription()
    }

    override fun onPause() {
        super.onPause()
        if (!subscriptions.isUnsubscribed)
            subscriptions.unsubscribe()
        subscriptions.clear()
    }
}