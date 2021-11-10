package com.xiwna.processor

import com.xiwna.base.BaseApplication
import com.xiwna.base.BaseApplicationImpl
import com.xiwna.base.ModuleConfig

class AppApplication : BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        initComponent()
        init()
    }

    override fun init() {
        initRouter()
    }

    override fun getModuleName(): String {
        return "app"
    }

    /**
     * 初始化各组件
     */
    private fun initComponent() {
        for (module in ModuleConfig.modules) {
            try {
                val clazz = Class.forName(module)
                val baseApplication = clazz.newInstance() as BaseApplicationImpl
                baseApplication.init()
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            } catch (e: IllegalAccessException) {
                e.printStackTrace()
            } catch (e: InstantiationException) {
                e.printStackTrace()
            }
        }
    }
}