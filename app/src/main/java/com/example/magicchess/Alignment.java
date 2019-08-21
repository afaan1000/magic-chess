package com.example.magicchess;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.magicchess.engine.pieces.Piece;
import com.example.magicchess.engine.player.PlayerInfo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.example.magicchess.engine.player.PlayerInfo.*;


public class Alignment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alignment);

        List<RelativeLayout> tiles = new ArrayList<>();

        tiles.add((RelativeLayout) findViewById(R.id.alignment00));
        tiles.add((RelativeLayout) findViewById(R.id.alignment01));
        tiles.add((RelativeLayout) findViewById(R.id.alignment02));
        tiles.add((RelativeLayout) findViewById(R.id.alignment03));
        tiles.add((RelativeLayout) findViewById(R.id.alignment04));
        tiles.add((RelativeLayout) findViewById(R.id.alignment05));
        tiles.add((RelativeLayout) findViewById(R.id.alignment06));
        tiles.add((RelativeLayout) findViewById(R.id.alignment07));
        tiles.add((RelativeLayout) findViewById(R.id.alignment08));
        tiles.add((RelativeLayout) findViewById(R.id.alignment09));
        tiles.add((RelativeLayout) findViewById(R.id.alignment10));
        tiles.add((RelativeLayout) findViewById(R.id.alignment11));
        tiles.add((RelativeLayout) findViewById(R.id.alignment12));
        tiles.add((RelativeLayout) findViewById(R.id.alignment13));
        tiles.add((RelativeLayout) findViewById(R.id.alignment14));
        tiles.add((RelativeLayout) findViewById(R.id.alignment15));
        tiles.add((RelativeLayout) findViewById(R.id.alignment16));
        tiles.add((RelativeLayout) findViewById(R.id.alignment17));
        tiles.add((RelativeLayout) findViewById(R.id.alignment18));
        tiles.add((RelativeLayout) findViewById(R.id.alignment19));
        tiles.add((RelativeLayout) findViewById(R.id.alignment20));
        tiles.add((RelativeLayout) findViewById(R.id.alignment21));
        tiles.add((RelativeLayout) findViewById(R.id.alignment22));
        tiles.add((RelativeLayout) findViewById(R.id.alignment23));
        tiles.add((RelativeLayout) findViewById(R.id.alignment24));
        tiles.add((RelativeLayout) findViewById(R.id.alignment25));
        tiles.add((RelativeLayout) findViewById(R.id.alignment26));
        tiles.add((RelativeLayout) findViewById(R.id.alignment27));
        tiles.add((RelativeLayout) findViewById(R.id.alignment28));
        tiles.add((RelativeLayout) findViewById(R.id.alignment28));
        tiles.add((RelativeLayout) findViewById(R.id.alignment30));
        tiles.add((RelativeLayout) findViewById(R.id.alignment31));
        tiles.add((RelativeLayout) findViewById(R.id.alignment32));
        tiles.add((RelativeLayout) findViewById(R.id.alignment33));
        tiles.add((RelativeLayout) findViewById(R.id.alignment34));
        tiles.add((RelativeLayout) findViewById(R.id.alignment35));
        tiles.add((RelativeLayout) findViewById(R.id.alignment36));
        tiles.add((RelativeLayout) findViewById(R.id.alignment37));
        tiles.add((RelativeLayout) findViewById(R.id.alignment38));
        tiles.add((RelativeLayout) findViewById(R.id.alignment39));
        tiles.add((RelativeLayout) findViewById(R.id.alignment40));
        tiles.add((RelativeLayout) findViewById(R.id.alignment41));
        tiles.add((RelativeLayout) findViewById(R.id.alignment42));
        tiles.add((RelativeLayout) findViewById(R.id.alignment43));
        tiles.add((RelativeLayout) findViewById(R.id.alignment44));
        tiles.add((RelativeLayout) findViewById(R.id.alignment45));
        tiles.add((RelativeLayout) findViewById(R.id.alignment46));
        tiles.add((RelativeLayout) findViewById(R.id.alignment47));
        tiles.add((RelativeLayout) findViewById(R.id.alignment48));
        tiles.add((RelativeLayout) findViewById(R.id.alignment49));
        tiles.add((RelativeLayout) findViewById(R.id.alignment50));
        tiles.add((RelativeLayout) findViewById(R.id.alignment51));
        tiles.add((RelativeLayout) findViewById(R.id.alignment52));
        tiles.add((RelativeLayout) findViewById(R.id.alignment53));
        tiles.add((RelativeLayout) findViewById(R.id.alignment54));
        tiles.add((RelativeLayout) findViewById(R.id.alignment55));
        tiles.add((RelativeLayout) findViewById(R.id.alignment56));
        tiles.add((RelativeLayout) findViewById(R.id.alignment57));
        tiles.add((RelativeLayout) findViewById(R.id.alignment58));
        tiles.add((RelativeLayout) findViewById(R.id.alignment59));
        tiles.add((RelativeLayout) findViewById(R.id.alignment60));
        tiles.add((RelativeLayout) findViewById(R.id.alignment61));
        tiles.add((RelativeLayout) findViewById(R.id.alignment62));
        tiles.add((RelativeLayout) findViewById(R.id.alignment63));


        PieceAlignment pieceAlignment = new PieceAlignment();
        pieceAlignment.pieceAlignmentIfBlack();
        //pieceAlignment.getPieceAlignment().size();
        Iterator hmIterator = pieceAlignment.getPieceAlignment().entries().iterator();
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
            RelativeLayout.LayoutParams layoutParams0 = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT
            );
            tiles.get((int)mapElement.getValue()).addView(imageView, layoutParams0);
        }


        PlayerInfo playerInfo = new PlayerInfo();
        CurrentPieces currentPieces = new CurrentPieces();
        List<Piece.PieceType> stageUnlockedPieces = currentPieces.getStageUnlockedPieces();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        //RelativeLayout relativeLayout
        for (Piece.PieceType piece : stageUnlockedPieces){
            RelativeLayout relativeLayout = new RelativeLayout(this);
            ImageView imageView = new ImageView(this);
            if (piece.equals(Piece.PieceType.PAWN)) {
                imageView.setImageResource(R.drawable.pawn);
            }
            else if (piece.equals(Piece.PieceType.ROOK)) {
                imageView.setImageResource(R.drawable.rook);
            }
            else if (piece.equals(Piece.PieceType.KNIGHT)) {
                imageView.setImageResource(R.drawable.knight);
            }
            else if (piece.equals(Piece.PieceType.BISHOP)) {
                imageView.setImageResource(R.drawable.bishop);
            }
            else if (piece.equals(Piece.PieceType.QUEEN)) {
                imageView.setImageResource(R.drawable.queen);
            }
            else if (piece.equals(Piece.PieceType.KING)) {
                imageView.setImageResource(R.drawable.king);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                    100,
                    100
            );
            /*imageView.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    50
            ));*/
            relativeLayout.addView(imageView, layoutParams);
            linearLayout.addView(relativeLayout);
        }

        setToggleEvent(linearLayout);
        swap2(linearLayout, tiles, stageUnlockedPieces, pieceAlignment);

    }

    private void setToggleEvent(final LinearLayout linearLayout){
        final LinearLayout linearLayout2 = linearLayout;
        final int childCount =  linearLayout.getChildCount();
        for (int i=0; i<linearLayout.getChildCount(); i++){
            final RelativeLayout relativeLayout = (RelativeLayout)linearLayout.getChildAt(i);
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //int colorId = ((ColorDrawable)relativeLayout.getBackground()).getColor();
                    int colorId = getBackgroundColor(relativeLayout);

                    //ColorDrawable viewColor = (ColorDrawable) relativeLayout.getBackground();
                    //int colorId = viewColor.getColor();
                    if (colorId == -1){
                        for (int j=0; j<childCount; j++){
                            final RelativeLayout relativeLayout2 = (RelativeLayout)linearLayout2.getChildAt(j);
                            int color = getBackgroundColor(relativeLayout2);
                            int red = (color >> 16) & 0xFF;
                            int green = (color >> 8) & 0xFF;
                            int blue = (color >> 0) & 0xFF;
                            String rgbColor = "#" + red + green + blue;
                            int rgbIntColor = Color.parseColor("#FF6F00");
                            if (getBackgroundColor(relativeLayout2) == rgbIntColor){
                                relativeLayout2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            }
                            else {
                                relativeLayout.setBackgroundColor(Color.parseColor("#FF6F00"));
                            }
                        }
                        relativeLayout.setBackgroundColor(Color.parseColor("#FF6F00"));
                    }
                    else {
                        relativeLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    }

                }
            });
        }

    }

    private void swap2(final LinearLayout linearLayout, List<RelativeLayout> tiles, List<Piece.PieceType> stageUnlockedPieces, final PieceAlignment pieceAlignment){

        final LinearLayout linearLayout2 = linearLayout;
        final List<Piece.PieceType> stageUnlockedPieces2 = stageUnlockedPieces;
        //final PieceAlignment pieceAlignment2 = pieceAlignment;
        for (int i=48; i>47 && i<64; i++){
            final RelativeLayout relativeLayout = tiles.get(i);
            final int indexOfRelativeLayout = i;


            //final Piece.PieceType finalSelectedPieceType = selectedPieceType;
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int fromLinearIndex;
                    Piece.PieceType selectedPieceType = null;
                    for (int i=0; i<linearLayout.getChildCount(); i++) {
                        final RelativeLayout relativeLayout = (RelativeLayout) linearLayout.getChildAt(i);
                        int rgbIntColor = Color.parseColor("#FF6F00");
                        if (getBackgroundColor(relativeLayout) == rgbIntColor) {
                            fromLinearIndex = linearLayout.indexOfChild(relativeLayout);
                            selectedPieceType = stageUnlockedPieces2.get(fromLinearIndex);
                        }
                    }
                    if (selectedPieceType != null) {
                        int toGridIndex = indexOfRelativeLayout;
                        ImageView imageView = new ImageView(getApplicationContext());
                        if (selectedPieceType.equals(Piece.PieceType.PAWN)) {
                            imageView.setImageResource(R.drawable.pawn);
                        } else if (selectedPieceType.equals(Piece.PieceType.ROOK)) {
                            imageView.setImageResource(R.drawable.rook);
                        } else if (selectedPieceType.equals(Piece.PieceType.KNIGHT)) {
                            imageView.setImageResource(R.drawable.knight);
                        } else if (selectedPieceType.equals(Piece.PieceType.BISHOP)) {
                            imageView.setImageResource(R.drawable.bishop);
                        } else if (selectedPieceType.equals(Piece.PieceType.QUEEN)) {
                            imageView.setImageResource(R.drawable.queen);
                        } else if (selectedPieceType.equals(Piece.PieceType.KING)) {
                            imageView.setImageResource(R.drawable.king);
                        }
                        for (int possibleStartPosition : (selectedPieceType.getPossibleStartPositions())) {
                            if (toGridIndex == possibleStartPosition) {
                                relativeLayout.removeAllViews();
                                /*RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                                        100,
                                        100
                                );*/
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                                        RelativeLayout.LayoutParams.WRAP_CONTENT
                                );
                                relativeLayout.addView(imageView, layoutParams);
                                pieceAlignment.getPieceAlignment().put(selectedPieceType, toGridIndex);
                                //int colorId = getBackgroundColor(relativeLayout);
                                //if (colorId == -1) {
                                    /*for (int j = 48; j > 47 && j < 64; j++) {
                                        final RelativeLayout relativeLayout2 = (RelativeLayout) linearLayout2.getChildAt(j);
                                        int color = getBackgroundColor(relativeLayout2);
                                        int red = (color >> 16) & 0xFF;
                                        int green = (color >> 8) & 0xFF;
                                        int blue = (color >> 0) & 0xFF;
                                        String rgbColor = "#" + red + green + blue;
                                        int rgbIntColor = Color.parseColor("#FF6F00");
                                        if (getBackgroundColor(relativeLayout2) == rgbIntColor) {
                                            relativeLayout2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                                        } else {
                                            relativeLayout.setBackgroundColor(Color.parseColor("#FF6F00"));
                                        }
                                    }*/
                                    relativeLayout.setBackgroundColor(Color.parseColor("#FF6F00"));
                                //}

                            } else {
                                //relativeLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                            }
                        }
                    }
                }
            });
        }

    }


    /*private void swap(final LinearLayout linearLayout, List<RelativeLayout> tiles, List<Piece.PieceType> stageUnlockedPieces){
        final LinearLayout linearLayout2 = linearLayout;
        //final GridLayout gridLayout = gridLayout;
        final int childCount =  linearLayout.getChildCount();
        final List<Piece.PieceType> stageUnlockedPieces2 = stageUnlockedPieces;
        int fromLinearindex;
        Piece.PieceType selectedPieceType = null;
        for (int i=0; i<linearLayout.getChildCount(); i++) {
            final RelativeLayout relativeLayout = (RelativeLayout) linearLayout.getChildAt(i);
            int rgbIntColor = Color.parseColor("#FF6F00");
            if (getBackgroundColor(relativeLayout) == rgbIntColor) {
                fromLinearindex = linearLayout.indexOfChild(relativeLayout);
                selectedPieceType = stageUnlockedPieces.get(fromLinearindex);
            }
        }

        for (int i=48; i>47 && i<64; i++){
            final RelativeLayout relativeLayout = tiles.get(i);


            final Piece.PieceType finalSelectedPieceType = selectedPieceType;
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //int fromLinearindex = linearLayout.indexOfChild(relativeLayout);
                    int toGridIndex = linearLayout.indexOfChild(relativeLayout);
                    int colorId = getBackgroundColor(relativeLayout);
                    ImageView imageView = new ImageView(getApplicationContext());
                    if (finalSelectedPieceType.equals(Piece.PieceType.PAWN)) {
                        imageView.setImageResource(R.drawable.pawn);
                    }
                    else if (finalSelectedPieceType.equals(Piece.PieceType.ROOK)) {
                        imageView.setImageResource(R.drawable.rook);
                    }
                    else if (finalSelectedPieceType.equals(Piece.PieceType.KNIGHT)) {
                        imageView.setImageResource(R.drawable.knight);
                    }
                    else if (finalSelectedPieceType.equals(Piece.PieceType.BISHOP)) {
                        imageView.setImageResource(R.drawable.bishop);
                    }
                    else if (finalSelectedPieceType.equals(Piece.PieceType.QUEEN)) {
                        imageView.setImageResource(R.drawable.queen);
                    }
                    else if (finalSelectedPieceType.equals(Piece.PieceType.KING)) {
                        imageView.setImageResource(R.drawable.king);
                    }
                    for (int possibleStartPosition : (finalSelectedPieceType.getPossibleStartPositions())) {
                        if (toGridIndex == possibleStartPosition){
                            relativeLayout.removeAllViews();
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                                    100,
                                    100
                            );
                            relativeLayout.addView(imageView, layoutParams);
                            relativeLayout.setBackgroundColor(Color.parseColor("#FF6F00"));

                        }
                    else{
                            relativeLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        }
                    }

                }
            });
        }

    }

    private void test(final LinearLayout linearLayout, List<RelativeLayout> tiles, List<Piece.PieceType> stageUnlockedPieces){
        final RelativeLayout relativeLayout = tiles.get(63);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(Color.parseColor("#FF6F00"));
            }
        });
    }*/

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
