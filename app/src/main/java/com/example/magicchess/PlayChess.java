package com.example.magicchess;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.magicchess.engine.board.BoardUtils;

import java.util.ArrayList;
import java.util.List;

public class PlayChess extends AppCompatActivity {

    List<Rect> tiles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_chess);

        List<ImageView> tiles = new ArrayList<>();
        for (int i = 0; i <= 64; i++) {
            tiles.add((ImageView) findViewById(R.id.a8));
        }
        /*//ImageView view = (ImageView) getResources().getDrawable(R.drawable.rook);
        Drawable myDrawable = getResources().getDrawable(R.drawable.rook);
        //myDrawable.setImageResource(R.drawable.myDrawable);
        ImageView view = (ImageView) myDrawable;*/
        /*int[] outLocation = new int[2];
        tiles.get(0).getLocationOnScreen(outLocation);
        //ImageView tile1 = findViewById(R.id.a8);
        ImageView imageView = null;
        imageView.setImageResource(R.drawable.rook);
        imageView.setX(outLocation[0]);
        imageView.setX(outLocation[1]);*/

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.rook);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.RelativeLayout01);

        int[] outLocation = new int[2];
        tiles.get(0).getLocationOnScreen(outLocation);
        relativeLayout.setX(outLocation[0]);
        relativeLayout.setY(outLocation[1]);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        //layoutParams.addRule(RelativeLayout.BELOW, R.id.buttonCalculate);
        //layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        relativeLayout.addView(imageView, layoutParams);


    }




}
