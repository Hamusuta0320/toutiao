package com.cxj.myapplication.http

import com.cxj.myapplication.mvp.model.BaseModel
import com.cxj.myapplication.ui.main.model.MainModel
import io.reactivex.Observable
import retrofit2.http.GET

interface UserApi {
    @GET("/")
    fun getTest(): Observable<BaseModel<MainModel>>
}