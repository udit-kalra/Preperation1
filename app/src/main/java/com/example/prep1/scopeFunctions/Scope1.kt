package com.example.prep1.scopeFunctions

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.view.Gravity.apply
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.prep1.R

fun main(){

}


fun myFun() {
    val outside = 6.2831853071

    run {
        val inside = 1.61803398875
        // Both outside and inside are usable and in scope
    }
    // inside is out of scope, and only outside is available
}


class Foo : Activity() {
    //...

    lateinit var myView: View

    fun doIt(){

        var hello:View=myView.apply {
            // this refers to myView rather than Foo inside the block.
            this.alpha = 0.5f
//            background = ContextCompat.getDrawable(context, R.drawable.my_drawable)

        }


        var hello2:View=myView.also {
            // this refers to myView rather than Foo inside the block.
            it.alpha = 0.5f
//            it.background = ContextCompat.getDrawable(this@Foo, R.drawable.my_drawable)
            ""
        }

        var hello3:String=myView.let {
            // this refers to myView rather than Foo inside the block.
            it.alpha = 0.5f
//            it.background = ContextCompat.getDrawable(this@Foo, R.drawable.my_drawable)
            ""
        }

        var hello4:String=myView.run {
            // this refers to myView rather than Foo inside the block.
            alpha = 0.5f
//            this.background = ContextCompat.getDrawable(context, R.drawable.my_drawable)
            ""
        }

        var hello5:String=with(myView) {
            // this refers to myView rather than Foo inside the block.
            alpha = 0.5f
//            this.background = ContextCompat.getDrawable(context, R.drawable.my_drawable)
            ""
        }

        var myData="Hello"

        var myIntent= Intent()
        myIntent?.run {
//            data = Uri(myData)
            startActivity(this)
        }


        myIntent?.also {
//            it.data = Uri(myData)
            startActivity(it)
        }

    }
}