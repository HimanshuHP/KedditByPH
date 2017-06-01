package com.example.himanshu.kedditbyph

import org.mockito.Mockito

/**
 * Created by himanshu on 01/06/17.
 */
inline fun <reified T : Any> mock(): T = Mockito.mock(T::class.java)


