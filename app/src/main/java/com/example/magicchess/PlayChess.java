package com.example.magicchess;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.magicchess.engine.board.Board;
import com.example.magicchess.engine.pieces.Piece;
import com.example.magicchess.engine.player.PlayerInfo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PlayChess extends AppCompatActivity {

    private Board chessBoard;
    private Piece humanMovedPiece;


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



        int alliance = getRandomNumberInRange(0, 1);



        PlayerInfo.PieceAlignment pieceAlignment = new PlayerInfo.PieceAlignment();
        if (alliance == 0){
            pieceAlignment.pieceAlignmentIfWhite();
            pieceAlignment.opponentPieceAlignmentIfBlack();
            chessBoard.createStandardBoard();

            Iterator hmIterator = pieceAlignment.getPieceAlignment().entries().iterator();
           while (hmIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) hmIterator.next();
                ImageView imageView = new ImageView(this);
                if ((int)mapElement.getValue() < 16) {
                    if (mapElement.getKey().equals(Piece.PieceType.PAWN)) {
                        imageView.setImageResource(R.drawable.pawn);
                    } else if (mapElement.getKey().equals(Piece.PieceType.ROOK)) {
                        imageView.setImageResource(R.drawable.w_rook);
                    } else if (mapElement.getKey().equals(Piece.PieceType.KNIGHT)) {
                        imageView.setImageResource(R.drawable.w_knight);
                    } else if (mapElement.getKey().equals(Piece.PieceType.BISHOP)) {
                        imageView.setImageResource(R.drawable.bishop);
                    } else if (mapElement.getKey().equals(Piece.PieceType.QUEEN)) {
                        imageView.setImageResource(R.drawable.w_queen);
                    } else if (mapElement.getKey().equals(Piece.PieceType.KING)) {
                        imageView.setImageResource(R.drawable.w_king);
                    }
                }
                else {
                    if (mapElement.getKey().equals(Piece.PieceType.PAWN)) {
                        imageView.setImageResource(R.drawable.pawn);
                    } else if (mapElement.getKey().equals(Piece.PieceType.ROOK)) {
                        imageView.setImageResource(R.drawable.rook);
                    } else if (mapElement.getKey().equals(Piece.PieceType.KNIGHT)) {
                        imageView.setImageResource(R.drawable.knight);
                    } else if (mapElement.getKey().equals(Piece.PieceType.BISHOP)) {
                        imageView.setImageResource(R.drawable.bishop);
                    } else if (mapElement.getKey().equals(Piece.PieceType.QUEEN)) {
                        imageView.setImageResource(R.drawable.queen);
                    } else if (mapElement.getKey().equals(Piece.PieceType.KING)) {
                        imageView.setImageResource(R.drawable.king);
                    }
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
        }
        else {
            pieceAlignment.pieceAlignmentIfBlack();
            pieceAlignment.opponentPieceAlignmentIfWhite();
            chessBoard.createStandardBoard2();

            Iterator hmIterator = pieceAlignment.getPieceAlignment().entries().iterator();

            while (hmIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) hmIterator.next();
                ImageView imageView = new ImageView(this);
                if ((int)mapElement.getValue() > 47) {
                    if (mapElement.getKey().equals(Piece.PieceType.PAWN)) {
                        imageView.setImageResource(R.drawable.pawn);
                    } else if (mapElement.getKey().equals(Piece.PieceType.ROOK)) {
                        imageView.setImageResource(R.drawable.rook);
                    } else if (mapElement.getKey().equals(Piece.PieceType.KNIGHT)) {
                        imageView.setImageResource(R.drawable.knight);
                    } else if (mapElement.getKey().equals(Piece.PieceType.BISHOP)) {
                        imageView.setImageResource(R.drawable.bishop);
                    } else if (mapElement.getKey().equals(Piece.PieceType.QUEEN)) {
                        imageView.setImageResource(R.drawable.queen);
                    } else if (mapElement.getKey().equals(Piece.PieceType.KING)) {
                        imageView.setImageResource(R.drawable.king);
                    }
                }
                else {
                    if (mapElement.getKey().equals(Piece.PieceType.PAWN)) {
                        imageView.setImageResource(R.drawable.pawn);
                    } else if (mapElement.getKey().equals(Piece.PieceType.ROOK)) {
                        imageView.setImageResource(R.drawable.w_rook);
                    } else if (mapElement.getKey().equals(Piece.PieceType.KNIGHT)) {
                        imageView.setImageResource(R.drawable.w_knight);
                    } else if (mapElement.getKey().equals(Piece.PieceType.BISHOP)) {
                        imageView.setImageResource(R.drawable.bishop);
                    } else if (mapElement.getKey().equals(Piece.PieceType.QUEEN)) {
                        imageView.setImageResource(R.drawable.w_queen);
                    } else if (mapElement.getKey().equals(Piece.PieceType.KING)) {
                        imageView.setImageResource(R.drawable.w_king);
                    }
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
        }
        //pieceAlignment.getPieceAlignment().size();



        /*ImageView imageView =  new ImageView(this);
        imageView.setImageResource(R.drawable.rook);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout00);

            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );

        relativeLayout.addView(imageView, layoutParams);*/

    }


    private void test(final LinearLayout linearLayout, List<RelativeLayout> tiles, List<Piece.PieceType> stageUnlockedPieces){

        final RelativeLayout sourceTile = null;

        for(int i = 0; i<63; i++) {
            final List<RelativeLayout> checkTiles = tiles;
            final RelativeLayout relativeLayout = tiles.get(i);
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for(int i = 0; i<63; i++) {
                        final RelativeLayout relativeLayoutCheck = checkTiles.get(i);
                        if (getBackgroundColor(relativeLayoutCheck) == Color.parseColor("#FF6F00") || getBackgroundColor(relativeLayoutCheck) == -1) {
                            relativeLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        }
                    }

                    relativeLayout.setBackgroundColor(Color.parseColor("#FF6F00"));
                }
            });
        }
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static int getBackgroundColor(View view) {
        Drawable drawable = view.getBackground();
        if (drawable instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) drawable;
            if (Build.VERSION.SDK_INT >= 11) {
                return colorDrawable.getColor();
            }
            try {
                Field field = colorDrawable.getClass().getDeclaredField("mState");
                field.setAccessible(true);
                Object object = field.get(colorDrawable);
                field = object.getClass().getDeclaredField("mUseColor");
                field.setAccessible(true);
                return field.getInt(object);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }




}
