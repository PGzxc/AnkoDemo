package com.example.ankodemo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.ankodemo.activity.dialog.DialogAndToastActivity
import com.example.ankodemo.activity.intent.IntentActivity
import com.example.ankodemo.activity.log.LogActivity
import com.example.ankodemo.activity.resources.ResourcesAndDimensionsActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by admin on 2018/3/12.
 */
class AnkoCommonsActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnkoCommonsActivityUI().setContentView(this)
    }
    class AnkoCommonsActivityUI:AnkoComponent<AnkoCommonsActivity>{

        override fun createView(ui: AnkoContext<AnkoCommonsActivity>)= with(ui){
          verticalLayout {
              button("跳转Intents"){
                  onClick { startActivity<IntentActivity>() }
              }
              button("Dialogs and toasts"){
                  onClick { startActivity<DialogAndToastActivity>() }
              }
              button("日志Log"){
                  onClick { startActivity<LogActivity>() }
              }
              button("资源Resource"){
                  onClick { startActivity<ResourcesAndDimensionsActivity>() }
              }
          }
        }
    }
}