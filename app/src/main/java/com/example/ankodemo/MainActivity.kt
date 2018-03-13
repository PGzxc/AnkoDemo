package com.example.ankodemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ankodemo.activity.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick
class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyActivityUI().setContentView(this)
    }

    class MyActivityUI : AnkoComponent<MainActivity>,AnkoLogger  {
        override fun createView(ui: AnkoContext<MainActivity>) = ui.apply {
            verticalLayout {
                button("Anko Commons") {
                    onClick { startActivity<AnkoCommonsActivity>()} }
                button("Anko Layouts"){
                    onClick { startActivity<AnkoLayoutsActivity>() }
                }
                button("Anko SQLite"){
                    onClick {  startActivity<AnkoSQLiteActivity>() }
                }
                button("Anko Coroutines"){
                    onClick {  startActivity<AnkoCoroutinesActivity>() }
                }
            }
        }.view

    }
}
