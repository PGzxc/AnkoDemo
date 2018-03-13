package com.example.ankodemo.activity.resources

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

/**
 * Anko Commons – Misc
 */
class ResourcesAndDimensionsActivity:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ResourcesAndDimensionsActivityUI().setContentView(this)
    }
    class ResourcesAndDimensionsActivityUI:AnkoComponent<ResourcesAndDimensionsActivity>{
        override fun createView(ui: AnkoContext<ResourcesAndDimensionsActivity>)= with(ui){
            verticalLayout {
                textView {
                    text="文本内容"
                    padding=dip(10)
                    textColor=0xff0000.opaque
                    textSize=18f

                }
                editText {
                    hint = "Name"
                }.lparams{
                    width= matchParent
                    height= wrapContent
                    leftPadding=dip(3)
                    leftMargin=dip(10)
                    rightMargin=dip(10)
                }
                editText {
                    hint = "Password"
                }

            }
        }

    }
}