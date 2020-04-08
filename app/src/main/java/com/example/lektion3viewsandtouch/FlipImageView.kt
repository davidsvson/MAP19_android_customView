package com.example.lektion3viewsandtouch

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatImageView

class FlipImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0, onDownImage : Int? = null
) : AppCompatImageView(context, attrs, defStyleAttr) {

    var defaultImage : Drawable

    init {
       defaultImage = drawable
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


