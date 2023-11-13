package com.example.mylibrary

class HelloWorld {

    fun main(args: String){


    }

    companion object {
        fun printLog() {
            println("From the library")

        }

      fun timesNumbers(num1:Float, num2: Float): Float{
          return num1*num2
      }
    }

}
