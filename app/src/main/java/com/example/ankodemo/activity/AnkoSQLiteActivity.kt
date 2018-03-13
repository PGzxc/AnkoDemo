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
class AnkoSQLiteActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnkoSQLiteActivityUI().setContentView(this)
    }
    class AnkoSQLiteActivityUI:AnkoComponent<AnkoSQLiteActivity>{
        override fun createView(ui: AnkoContext<AnkoSQLiteActivity>)= with(ui){
            verticalLayout {  }
        }

    }
}