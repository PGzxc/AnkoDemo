package com.example.ankodemo.activity.intent

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.ankodemo.activity.SecondActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Anko Commons – Intents
 */
class IntentActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        IntentActivityUI().setContentView(this)
    }
    class IntentActivityUI:AnkoComponent<IntentActivity>{
        override fun createView(ui: AnkoContext<IntentActivity>)= with(ui){
            verticalLayout {
                button("Intent跳转传值"){
                    onClick {
                        startActivity<SecondActivity>("id" to "5")
                    }
                }
                button("打电话"){
                    onClick { makeCall("10086") }
                }
                button("发短信"){
                    onClick {  sendSMS("10080","您的话费已到账") }
                }
                button("浏览器"){
                    onClick {  browse("http://www.baidu.com") }
                }
                button("分享"){
                    onClick { share("分享内容") }
                }
            }
        }

    }
}