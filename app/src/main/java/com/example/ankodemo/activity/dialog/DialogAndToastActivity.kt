package com.example.ankodemo.activity.dialog

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.ankodemo.R
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Anko Commons – Dialogs
 */
class DialogAndToastActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DialogAndToastActivityUI().setContentView(this)

    }
    class DialogAndToastActivityUI:AnkoComponent<DialogAndToastActivity>{
        override fun createView(ui: AnkoContext<DialogAndToastActivity>)= with(ui){
            scrollView {

            verticalLayout {
                button("土司——String"){
                    onClick { toast("Hi there!") }
                }
                button("土司——R.string"){
                    onClick { toast(R.string.message) }
                }
                button("longToast"){
                    onClick { longToast("Wow, such duration") }
                }
                button("snackbar"){
                    onClick {
                        //snackbar(this@verticalLayout, "Hi there!")
                    }
                }
                button("对话框"){
                    onClick {
                        alert("Hi, I'm Roy", "Have you tried turning it off and on again?") {
                        yesButton { toast("Oh…") }
                        noButton {}
                    }.show() }
                }
                button("多选框"){
                  onClick {
                      val countries = listOf("Russia", "USA", "Japan", "Australia")
                      selector("Where are you from?", countries, { dialogInterface, i ->
                          toast("So you're living in ${countries[i]}, right?")
                      }) }
                }
                button("进度条"){
                    onClick {
                        val dialog = progressDialog(message = "Please wait a bit…", title = "Fetching data"){
                            isIndeterminate=true
                        }
                        dialog.show()
                    }
                }
            }
        }
        }
    }
}