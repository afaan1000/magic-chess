package com.example.magicchess;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;

import com.example.magicchess.engine.board.BoardUtils;

import java.util.ArrayList;
import java.util.List;

public class PlayChess extends AppCompatActivity {

    List<Rect> tiles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_chess);
    }




}
