package com.cxj.myapplication.ui.main.act

import android.util.Log
import com.cxj.myapplication.R
import com.cxj.myapplication.base.BaseActivity
import com.cxj.myapplication.ui.main.presenter.MainPresenter
import com.cxj.myapplication.ui.main.view.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainView, MainPresenter>(), MainView {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun init() {
        btn_test.setOnClickListener {
            getPresenter()!!.getTest("test")
        }
    }

    override fun initData() {
    }

    override fun createPresenter() = MainPresenter()

    override fun <T> setData(data: T) {
        Log.e("test", "=============>$data")
    }

    override fun setError(err: String) {
        Log.e("test", "=============>$err")
    }
}