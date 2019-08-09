package com.example.magicchess;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Rect;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.magicchess.engine.pieces.Piece;
import com.example.magicchess.engine.player.PlayerInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PlayChess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_chess);

        List<RelativeLayout> tiles = new ArrayList<>();

        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout00));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout01));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout02));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout03));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout04));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout05));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout06));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout07));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout08));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout09));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout10));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout11));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout12));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout13));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout14));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout15));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout16));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout17));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout18));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout19));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout20));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout21));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout22));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout23));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout24));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout25));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout26));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout27));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout28));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout29));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout30));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout31));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout32));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout33));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout34));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout35));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout36));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout37));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout38));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout39));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout40));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout41));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout42));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout43));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout44));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout45));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout46));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout47));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout48));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout49));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout50));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout51));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout52));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout53));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout54));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout55));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout56));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout57));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout58));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout59));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout60));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout61));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout62));
        tiles.add((RelativeLayout) findViewById(R.id.relativeLayout63));




        PlayerInfo.PieceAlignment pieceAlignment = new PlayerInfo.PieceAlignment();
        //pieceAlignment.getPieceAlignment().size();
        Iterator hmIterator = pieceAlignment.getPieceAlignment().entrySet().iterator();

        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            ImageView imageView = new ImageView(this);
            if (mapElement.getKey().equals(Piece.PieceType.PAWN)) {
                imageView.setImageResource(R.drawable.pawn);
            }
            else if (mapElement.getKey().equals(Piece.PieceType.ROOK)) {
                imageView.setImageResource(R.drawable.rook);
            }
            else if (mapElement.getKey().equals(Piece.PieceType.KNIGHT)) {
                imageView.setImageResource(R.drawable.knight);
            }
            else if (mapElement.getKey().equals(Piece.PieceType.BISHOP)) {
                imageView.setImageResource(R.drawable.bishop);
            }
            else if (mapElement.getKey().equals(Piece.PieceType.QUEEN)) {
                imageView.setImageResource(R.drawable.queen);
            }
            else if (mapElement.getKey().equals(Piece.PieceType.KING)) {
                imageView.setImageResource(R.drawable.king);
            }

            //RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout00);

            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            tiles.get((int)mapElement.getValue()).addView(imageView, layoutParams);
            //int marks = ((int)mapElement.getValue() + 10);
            //System.out.println(mapElement.getKey() + " : " + marks);
        }


        /*ImageView imageView =  new ImageView(this);
        imageView.setImageResource(R.drawable.rook);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout00);

            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );

        relativeLayout.addView(imageView, layoutParams);*/





    }




}
