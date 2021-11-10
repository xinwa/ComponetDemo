package com.xiwna.share

import com.xiwna.base.BaseApplication

class ShareApplication : BaseApplication() {
    override fun init() {
        initRouter()
    }

    override fun getModuleName(): String {
        return "share"
    }
}