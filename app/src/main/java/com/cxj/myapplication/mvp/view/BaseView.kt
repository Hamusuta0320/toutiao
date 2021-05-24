package com.cxj.myapplication.mvp.view

interface BaseView {
    fun <T> setData(data: T)
    fun setError(err: String)
}