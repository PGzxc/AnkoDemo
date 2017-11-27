package com.example.ankodemo
import android.app.*
import android.view.*
import org.jetbrains.anko.*
import android.os.Bundle

class SomeActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyView().setContentView(this)
    }

    class MyView : AnkoComponent<SomeActivity> {
        override fun createView(ui: AnkoContext<SomeActivity>): View = ui.apply {
            linearLayout {
                textView("Hello World!").lparams(width = wrapContent, height = wrapContent)
            }
        }.view
    }

}