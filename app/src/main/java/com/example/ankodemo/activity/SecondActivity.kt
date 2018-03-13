package com.example.ankodemo.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import org.jetbrains.anko.*

/**
 * Created by admin on 2018/3/12.
 */
class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SecondActivityUi().setContentView(this)
        var msg=  intent.extras.get("id")
        toast("得到传值为："+msg.toString())
    }

  class SecondActivityUi:AnkoComponent<SecondActivity>{
      @SuppressLint("SetTextI18n")
      override fun createView(ui: AnkoContext<SecondActivity>)= with(ui){
          verticalLayout {
              textView {
                  text ="通过传值获得内容为:"+ui.owner.intent.extras.get("id")
              }

          }
      }

  }
}