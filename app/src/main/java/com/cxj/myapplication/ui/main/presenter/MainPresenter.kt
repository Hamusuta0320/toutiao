package com.cxj.myapplication.ui.main.presenter

import android.util.Log
import com.cxj.myapplication.http.HttpUtils
import com.cxj.myapplication.http.ResponseListener
import com.cxj.myapplication.http.UserApi
import com.cxj.myapplication.mvp.model.BaseModel
import com.cxj.myapplication.mvp.presenter.BasePresenter
import com.cxj.myapplication.ui.main.model.MainModel
import com.cxj.myapplication.ui.main.view.MainView

class MainPresenter: BasePresenter<MainView>() {
    fun getTest(str: String) {
        Log.e("test3", "=============>运行")
        HttpUtils.sendHttp(HttpUtils.createApi(UserApi::class.java).getTest(), object :ResponseListener<BaseModel<MainModel>>{
            override fun onSuccess(data: BaseModel<MainModel>) {
                Log.e("test2", "=============>$data")
                if(data!=null) {
                    getBaseView()!!.setData(data)
                }
            }

            override fun onFail(err: String) {
                Log.e("test", "=============>$err")
                getBaseView()!!.setError(err)
            }

        })
    }
}