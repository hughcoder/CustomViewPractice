package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {
    Paint paint= new Paint();

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//drawCircle( 前两个参数 centerX centerY 是圆心的坐标，第三个参数 radius 是圆的半径，
        paint.setStyle(Paint.Style.STROKE);//空心圆
        paint.setColor(Color.BLUE);

        paint.setAntiAlias(true); //是否抗锯齿
        //4.线宽为 20 的空心圆
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);


        canvas.drawCircle(300,300,300,paint);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
    }
}
