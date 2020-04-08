package com.example.lektion3viewsandtouch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //version 3









        val imageView = findViewById<ImageView>(R.id.imageView)

        // version 2 vi använde en imageview och la till en touchlistener på den.
        // om vi trycker på bilden byts bilden till en katt
        // och om vi släpper igen byts bilden till en hund
        imageView.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                when(event?.action) {
                    MotionEvent.ACTION_DOWN -> {
                        Log.d("MotionEvent", "Down")
                        imageView.setImageResource(R.drawable.cat)
                    }
                    MotionEvent.ACTION_UP -> {
                        Log.d("MotionEvent", "Up")
                        imageView.setImageResource(R.drawable.dog)
                    }

                }
                return true
            }
        })



    }


    // version 1
    // kommer att köras om ett toch event sker någon stans i hela aktiviteten (hela skärmen)
 /*   override fun onTouchEvent(event: MotionEvent?): Boolean {

        when(event?.action) {
            MotionEvent.ACTION_DOWN -> {
                Log.d("MotionEvent","Down!")
            }
            MotionEvent.ACTION_UP -> {
                Log.d("MotionEvent","Up!")
            }
        }

        return super.onTouchEvent(event)
    }
*/



    //reagerade på knapp tryck på 2 sätt
    //1 . onclick i xml-filen angav en funktion som ska köras

    // 2. sätt en clicklistener på knappen i vår kotlin kod





}
