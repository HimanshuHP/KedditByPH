@file:JvmName("ExtensionsUtils")

package com.example.himanshu.kedditbyph.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by himanshu on 28/05/17.
 */

fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, false)
}
