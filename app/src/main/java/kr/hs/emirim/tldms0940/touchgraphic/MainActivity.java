package kr.hs.emirim.tldms0940.touchgraphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawShape(getApplicationContext()));
    }
    class DrawShape extends View{
        DrawShape(Context context){
            super(context);
        }
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            float cx=getWidth()/2.0f;
            float cy=getHeight()/2.0f;
            Paint paint = new Paint();
            paint.setStrokeWidth(7);
            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(cx,cy,50,paint);
            paint.setColor(Color.MAGENTA);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(10,10,210,160,paint);
        }
    }
}
