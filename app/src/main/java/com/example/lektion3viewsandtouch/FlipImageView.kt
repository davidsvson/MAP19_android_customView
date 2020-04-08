package com.example.lektion3viewsandtouch

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView

class FlipImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0,var onDownImage : Int? = null, var defaultImage : Drawable? = null
) : AppCompatImageView(context, attrs, defStyleAttr) {


    init {
       defaultImage = drawable
    }


    override fun onTouchEvent(event: MotionEvent?): Boolean {

        when(event?.action) {
            MotionEvent.ACTION_DOWN -> {

                onDownImage?.let { image ->
                    setImageResource(image)
                }
                /*
                if(onDownImage != null) {
                    setImageResource(onDownImage!!)
                }*/

            }
            MotionEvent.ACTION_UP -> {
                defaultImage?.let { image ->
                    setImageDrawable(image)
                }
            }
        }

        return true
    }




}

/* hur vi skulle göra det i java
public class FlipImageView extends AppCompatImageView {

    public FlipImageView(Context context) {
        super(context, null, 0)
        init()
    }

    public FlipImageView(Context context, AttributeSet attrs) {
        super(context, attrs, 0)
        init()
    }

    public FlipImageView(Context context, AttributeSet attrs, int defstyle) {
        super(context, attrs, defStyle)
        init()
    }

    private init() {
    //
    }

}*/


