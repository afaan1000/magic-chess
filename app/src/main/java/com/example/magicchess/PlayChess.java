package com.example.magicchess;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.magicchess.engine.board.BoardUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayChess extends AppCompatActivity {

    List<Rect> tiles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_chess);

        List<ImageView> tiles = new ArrayList<>();

        tiles.add((ImageView) findViewById(R.id.a8));
        tiles.add((ImageView) findViewById(R.id.b8));
        tiles.add((ImageView) findViewById(R.id.c8));
        tiles.add((ImageView) findViewById(R.id.d8));
        tiles.add((ImageView) findViewById(R.id.e8));
        tiles.add((ImageView) findViewById(R.id.f8));
        tiles.add((ImageView) findViewById(R.id.g8));
        tiles.add((ImageView) findViewById(R.id.h8));
        tiles.add((ImageView) findViewById(R.id.a7));
        tiles.add((ImageView) findViewById(R.id.b7));
        tiles.add((ImageView) findViewById(R.id.c7));
        tiles.add((ImageView) findViewById(R.id.d7));
        tiles.add((ImageView) findViewById(R.id.e7));
        tiles.add((ImageView) findViewById(R.id.f7));
        tiles.add((ImageView) findViewById(R.id.g7));
        tiles.add((ImageView) findViewById(R.id.h7));
        tiles.add((ImageView) findViewById(R.id.a6));
        tiles.add((ImageView) findViewById(R.id.b6));
        tiles.add((ImageView) findViewById(R.id.c6));
        tiles.add((ImageView) findViewById(R.id.d6));
        tiles.add((ImageView) findViewById(R.id.e6));
        tiles.add((ImageView) findViewById(R.id.f6));
        tiles.add((ImageView) findViewById(R.id.g6));
        tiles.add((ImageView) findViewById(R.id.h6));
        tiles.add((ImageView) findViewById(R.id.a5));
        tiles.add((ImageView) findViewById(R.id.b5));
        tiles.add((ImageView) findViewById(R.id.c5));
        tiles.add((ImageView) findViewById(R.id.d5));
        tiles.add((ImageView) findViewById(R.id.e5));
        tiles.add((ImageView) findViewById(R.id.f5));
        tiles.add((ImageView) findViewById(R.id.g5));
        tiles.add((ImageView) findViewById(R.id.h5));
        tiles.add((ImageView) findViewById(R.id.a4));
        tiles.add((ImageView) findViewById(R.id.b4));
        tiles.add((ImageView) findViewById(R.id.c4));
        tiles.add((ImageView) findViewById(R.id.d4));
        tiles.add((ImageView) findViewById(R.id.e4));
        tiles.add((ImageView) findViewById(R.id.f4));
        tiles.add((ImageView) findViewById(R.id.g4));
        tiles.add((ImageView) findViewById(R.id.h4));
        tiles.add((ImageView) findViewById(R.id.a3));
        tiles.add((ImageView) findViewById(R.id.b3));
        tiles.add((ImageView) findViewById(R.id.c3));
        tiles.add((ImageView) findViewById(R.id.d3));
        tiles.add((ImageView) findViewById(R.id.e3));
        tiles.add((ImageView) findViewById(R.id.f3));
        tiles.add((ImageView) findViewById(R.id.g3));
        tiles.add((ImageView) findViewById(R.id.h3));
        tiles.add((ImageView) findViewById(R.id.a2));
        tiles.add((ImageView) findViewById(R.id.b2));
        tiles.add((ImageView) findViewById(R.id.c2));
        tiles.add((ImageView) findViewById(R.id.d2));
        tiles.add((ImageView) findViewById(R.id.e2));
        tiles.add((ImageView) findViewById(R.id.f2));
        tiles.add((ImageView) findViewById(R.id.g2));
        tiles.add((ImageView) findViewById(R.id.h2));
        tiles.add((ImageView) findViewById(R.id.a1));
        tiles.add((ImageView) findViewById(R.id.b1));
        tiles.add((ImageView) findViewById(R.id.c1));
        tiles.add((ImageView) findViewById(R.id.d1));
        tiles.add((ImageView) findViewById(R.id.e1));
        tiles.add((ImageView) findViewById(R.id.f1));
        tiles.add((ImageView) findViewById(R.id.g1));
        tiles.add((ImageView) findViewById(R.id.h1));


        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.rook);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.RelativeLayout01);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        int tileX = (int) tiles.get(0).getX();
        int tileY = (int) tiles.get(0).getY();
        System.out.println(tileX);

        relativeLayout.setX(100);
        relativeLayout.setY(100);

        relativeLayout.addView(imageView, layoutParams);
        imageView.setLayoutParams(layoutParams);

        RelativeLayout gridLayout = (RelativeLayout) findViewById(R.id.gridLayout);


    }




}
