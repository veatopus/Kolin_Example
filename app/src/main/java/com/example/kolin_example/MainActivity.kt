package com.example.kolin_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myInt = 7

        if (myInt == 7) {
            myInt = 8
        }

        when (myInt) {
            7 -> Log.d("ololo", "my Message 7")
            8 -> myInt = 1000
            9, 10 -> Log.d("ololo", "my Message 9 или 10")
            in 10..19 -> Log.d("ololo","myInt в диапазоне от 10 до 19")
            in 20..29 -> Log.d("ololo","myInt в диапазоне от 20 до 29")
            !in 10..20 -> Log.d("ololo","myInt вне диапазона от 10 до 20")
            else -> Log.d("ololo", "my Message else")
        }

        val rate = when(myInt){
            in 100..999 -> 10
            in 1000..9999 -> 15
            else -> 20
        }

        Log.d("ololo", "my Message rate = $rate myInt = $myInt")

        for(i in 1..9){
            for(j in 1..9){
                print("${i * j} \t")
            }
            println()
        }

        

    }
}
