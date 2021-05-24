package com.cxj.myapplication.mvp.presenter

open class BasePresenter<V> {
    private var mBaseView: V? = null

    fun bindView(mBaseView: V) {
        this.mBaseView = mBaseView
    }

    fun unBindView() {
        this.mBaseView = null
    }

    fun getBaseView() = mBaseView
}