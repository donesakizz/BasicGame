package com.example.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.Random;

public class Plane extends BaseObject{

    public static int speed;
    public Plane(float x, float y, int width ,int height ){
        super(x, y, width, height);
        speed=10*Constants.SCREEN_WIDTH/1000;

    }

    public void draw(Canvas canvas){
        this.x =speed;
        canvas.drawBitmap(this.bm, this.x, this.y ,null);

    }

    public void randomY(){
        Random rand =new Random();
        this.y = rand.nextInt((0+this.height/4) + 1) - this.height/4;
    }


    @Override
    public void setBm(Bitmap bm) {
        this.bm = Bitmap.createScaledBitmap(bm, width, height, true );
    }

}
