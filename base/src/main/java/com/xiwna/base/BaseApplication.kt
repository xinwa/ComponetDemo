package com.xiwna.base

import android.app.Application

abstract class BaseApplication : Application(), BaseApplicationImpl {

    protected fun initRouter() {
        val clazz = Class.forName(getRouterInitName())
        val method = clazz.getMethod("init")
        method.invoke(null)
    }

    private fun getRouterInitName(): String {
        return "com.xiwna.stub.router.RouterInit_" + getModuleName()
    }
}