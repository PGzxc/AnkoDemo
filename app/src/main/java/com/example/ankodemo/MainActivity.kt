package com.example.ankodemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyActivityUI().setContentView(this)
    }

    class MyActivityUI : AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>) = ui.apply {
            verticalLayout {
                val name = editText()
                button("Say Hello") {
                    onClick {
                        ctx.toast("Hello, ${name.text}!")
                        startActivity<SomeActivity>()
                    }
                }
            }
        }.view
    }
}
