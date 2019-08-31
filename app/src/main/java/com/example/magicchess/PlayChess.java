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
import com.example.magicchess.engine.board.Move;
import com.example.magicchess.engine.pieces.Piece;
import com.example.magicchess.engine.player.MoveTransition;
import com.example.magicchess.engine.player.PlayerInfo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static com.example.magicchess.engine.player.PlayerInfo.*;

public class PlayChess extends AppCompatActivity {

    private Board chessBoard;
    private Piece humanMovedPiece;
    private Piece sourceTile;
    private RelativeLayout fromRelativeLayout;
    private ImageView saveImageView;


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



        int alliance = getRandomNumberInRange(0, 2);

        System.out.println(alliance);

        PieceAlignment pieceAlignment = new PieceAlignment();
        if (alliance == 0){
            pieceAlignment.pieceAlignmentIfWhite();
            pieceAlignment.opponentPieceAlignmentIfBlack();
            chessBoard = chessBoard.createStandardBoard2();

            Iterator hmIterator = pieceAlignment.getPieceAlignment().entries().iterator();

            while (hmIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) hmIterator.next();
                ImageView imageView = new ImageView(this);
                if ((int)mapElement.getValue() > 47) {
                    if (mapElement.getKey().equals(Piece.PieceType.PAWN)) {
                        imageView.setImageResource(R.drawable.wp);
                    } else if (mapElement.getKey().equals(Piece.PieceType.ROOK)) {
                        imageView.setImageResource(R.drawable.wr);
                    } else if (mapElement.getKey().equals(Piece.PieceType.KNIGHT)) {
                        imageView.setImageResource(R.drawable.wn);
                    } else if (mapElement.getKey().equals(Piece.PieceType.BISHOP)) {
                        imageView.setImageResource(R.drawable.wb);
                    } else if (mapElement.getKey().equals(Piece.PieceType.QUEEN)) {
                        imageView.setImageResource(R.drawable.wq);
                    } else if (mapElement.getKey().equals(Piece.PieceType.KING)) {
                        imageView.setImageResource(R.drawable.wk);
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
                System.out.println(mapElement.getValue());
                //int marks = ((int)mapElement.getValue() + 10);
                //System.out.println(mapElement.getKey() + " : " + marks);
            }
        }
        else {
            pieceAlignment.pieceAlignmentIfBlack();
            pieceAlignment.opponentPieceAlignmentIfWhite();
            chessBoard = chessBoard.createStandardBoard();

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
                        imageView.setImageResource(R.drawable.wp);
                    } else if (mapElement.getKey().equals(Piece.PieceType.ROOK)) {
                        imageView.setImageResource(R.drawable.wr);
                    } else if (mapElement.getKey().equals(Piece.PieceType.KNIGHT)) {
                        imageView.setImageResource(R.drawable.wn);
                    } else if (mapElement.getKey().equals(Piece.PieceType.BISHOP)) {
                        imageView.setImageResource(R.drawable.wb);
                    } else if (mapElement.getKey().equals(Piece.PieceType.QUEEN)) {
                        imageView.setImageResource(R.drawable.wq);
                    } else if (mapElement.getKey().equals(Piece.PieceType.KING)) {
                        imageView.setImageResource(R.drawable.wk);
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

        test(tiles, pieceAlignment);

    }

    // move piece on gui
    private void test(List<RelativeLayout> tiles, final PieceAlignment pieceAlignment){

        for(int i = 0; i<64; i++) {
            final int piecePosition = i;
            final List<RelativeLayout> checkTiles = tiles;
            final RelativeLayout relativeLayout = tiles.get(i);

            relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (sourceTile == null) {
                        /*for(int i = 0; i<63; i++) {
                            final RelativeLayout relativeLayoutCheck = checkTiles.get(i);
                            if (getBackgroundColor(relativeLayoutCheck) == Color.parseColor("#FF6F00") || getBackgroundColor(relativeLayoutCheck) == -1) {
                                if (fromRelativeLayout != null) {
                                    fromRelativeLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                }
                            }
                        }*/

                        sourceTile = chessBoard.getPiece(piecePosition);
                        //sourceTile = piecePosition;
                        System.out.println(sourceTile.getPieceType() == Piece.PieceType.PAWN);
                        relativeLayout.setBackgroundColor(Color.parseColor("#FF6F00"));
                        humanMovedPiece = sourceTile;
                        if (humanMovedPiece == null) {
                            sourceTile = null;
                        }
                        fromRelativeLayout = relativeLayout;
                        saveImageView = (ImageView) fromRelativeLayout.getChildAt(0);
                    }else {
                        final Move move = Move.MoveFactory.createMove(chessBoard, sourceTile.getPiecePosition(),
                                piecePosition);
                        final MoveTransition transition = chessBoard.currentPlayer().makeMove(move);
                        System.out.println("" + sourceTile.getPiecePosition() + "    " + piecePosition + transition.getMoveStatus());
                        if (transition.getMoveStatus().isDone() == true || chessBoard.currentPlayer().isMoveLegal(move)) {
                            chessBoard = transition.getToBoard();
                            fromRelativeLayout.removeAllViews();
                            relativeLayout.removeAllViews();
                            relativeLayout.addView(saveImageView);

                            //moveLog.addMove(move);
                        }
                        sourceTile = null;
                        humanMovedPiece = null;
                    }
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
