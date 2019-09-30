package com.vv.mydraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View {
    public MyDraw(Context context) {
        super(context);
    }
    Paint paint = new Paint();
    public void onDraw(Canvas c){
        c.drawColor(Color.rgb(255, 0, 255));
    }
}
