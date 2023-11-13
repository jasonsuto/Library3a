package com.example.library3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mylibrary.HelloWorld

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        HelloWorld.printLog()

        println("Hello, I am here!!!")


        println(HelloWorld.timesNumbers(7f,9f))

    }
}