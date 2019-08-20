package com.example.magicchess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        init();
        battle();
        alignment();
    }

    public ImageView piecesButton;

    public void init(){
        piecesButton = (ImageView) findViewById(R.id.pieces);
        piecesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent piecesPage = new Intent(MainActivity.this, Pieces.class);

                startActivity(piecesPage);

            }
        });
    }

    public Button battle;

    public void battle(){
        battle = (Button) findViewById(R.id.battleButton);
        battle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent boardPage = new Intent(MainActivity.this, PlayChess.class);

                startActivity(boardPage);

            }
        });
    }

    public Button alignment;

    public void alignment(){
        alignment = (Button) findViewById(R.id.allignmentButton);
        alignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alignmentPage = new Intent(MainActivity.this, Alignment.class);

                startActivity(alignmentPage);

            }
        });
    }

}
