package com.example.ankodemo.activity.log

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Anko Commons – Logging
 */
class LogActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogActivityUI().setContentView(this)
    }
    class LogActivityUI:AnkoComponent<LogActivity>{
        override fun createView(ui: AnkoContext<LogActivity>)= with(ui){
            verticalLayout {

                button("Log——debug"){
                    onClick {
                        //info("London is the capital of Great Britain")
                        debug(5) // .toString() method will be executed
                        //warn(null) // "null" will be printed
                    }
                }
            }
        }

    }
}