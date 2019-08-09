package com.example.magicchess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.magicchess.engine.player.PlayerInfo;

public class Alignment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alignment);

        PlayerInfo playerInfo = new PlayerInfo();

        //playerInfo.PieceAlignment pieceAlignment = playerInfo.new PieceAlignment();

        //playerInfo.Stage sdsada = playerInfo.new Stage();

        PlayerInfo.PieceAlignment pieceAlignment = new PlayerInfo.PieceAlignment();

    }
}
