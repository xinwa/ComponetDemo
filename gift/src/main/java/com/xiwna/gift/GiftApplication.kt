package com.xiwna.gift

import com.xiwna.base.BaseApplication

class GiftApplication : BaseApplication() {

    override fun init() {
        initRouter()
    }

    override fun getModuleName(): String {
        return "gift"
    }
}