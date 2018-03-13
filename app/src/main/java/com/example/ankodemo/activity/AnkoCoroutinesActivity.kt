package com.example.ankodemo.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.verticalLayout

/**
 * Created by admin on 2018/3/12.
 */
class AnkoCoroutinesActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnkoCoroutinesActivityUI().setContentView(this)
    }
    class AnkoCoroutinesActivityUI:AnkoComponent<AnkoCoroutinesActivity>{
        override fun createView(ui: AnkoContext<AnkoCoroutinesActivity>)= with(ui){
            verticalLayout {  }
        }
    }
}