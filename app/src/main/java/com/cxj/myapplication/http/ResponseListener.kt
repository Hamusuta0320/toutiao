package com.cxj.myapplication.http

interface ResponseListener<T> {
    fun onSuccess(data: T)
    fun onFail(err: String)
}