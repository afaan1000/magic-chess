package com.example.magicchess.engine.player;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.magicchess.Pieces;
import com.example.magicchess.engine.pieces.Piece;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import static com.example.magicchess.engine.pieces.Piece.*;


public class PlayerInfo  {


    public class Trophies{

        int trophies;

        public Trophies(){
            this.trophies = 0;
        }

        public void addTrophies(){
            //if win, randomly add any positive number of trophies between 10-15 based on apponent stage and trophies
            //if win, randomly add any negative number of trophies between 10-15 based on apponent stage and trophies

        }

        public int getTrophies(){
            return this.trophies;
        }
    }

    public class Stage{

        int stage;

        public Stage(){
            this.stage = 1;
        }

        public void incrementStage(){
            stage ++;
        }

        public int getStage(){
            return this.stage;
        }
    }

    public class CurrentPieces {

        List <PieceType> allPieces;
        List <PieceType> playerStagePieces;
        List <PieceType> stageUnlockedPieces;

        public CurrentPieces(){
            this.allPieces = new ArrayList<>();
            this.playerStagePieces = new ArrayList<>();
            this.stageUnlockedPieces = new ArrayList<>();
        }

        public void piecesAtStartOfGame(){
            allPieces.add(PieceType.PAWN);
            allPieces.add(PieceType.KING);
            allPieces.add(PieceType.ROOK);
            allPieces.add(PieceType.BISHOP);
            allPieces.add(PieceType.QUEEN);
            allPieces.add(PieceType.KNIGHT);

            playerStagePieces.add(PieceType.PAWN);
            playerStagePieces.add(PieceType.KING);
            playerStagePieces.add(PieceType.ROOK);
            playerStagePieces.add(PieceType.BISHOP);
            playerStagePieces.add(PieceType.QUEEN);
            playerStagePieces.add(PieceType.KNIGHT);

            stageUnlockedPieces.add(PieceType.PAWN);
            stageUnlockedPieces.add(PieceType.KING);
            stageUnlockedPieces.add(PieceType.ROOK);
            stageUnlockedPieces.add(PieceType.BISHOP);
            stageUnlockedPieces.add(PieceType.QUEEN);
            stageUnlockedPieces.add(PieceType.KNIGHT);


        }
        public void addToPlayerStagePieces(PieceType piece){

        }

        public void addToStageUnlockedPieces(PieceType piece){

        }

        public List<PieceType> getAllPieces() {
            return allPieces;
        }

        public List<PieceType> getPlayerStagePieces() {
            return playerStagePieces;
        }

        public List<PieceType> getStageUnlockedPieces() {
            return stageUnlockedPieces;
        }
    }

    public static class PieceAlignment{

        Multimap<PieceType, Integer> pieceAlignment;
        //List<PieceType> pieceAlignment;
        //CurrentPieces currentPieces;

        public PieceAlignment(){
            this.pieceAlignment = ArrayListMultimap.create();
            pieceAlignment.put(PieceType.PAWN, 48);
            pieceAlignment.put(PieceType.PAWN, 49);
            pieceAlignment.put(PieceType.PAWN, 50);
            pieceAlignment.put(PieceType.PAWN, 51);
            pieceAlignment.put(PieceType.PAWN, 52);
            pieceAlignment.put(PieceType.PAWN, 53);
            pieceAlignment.put(PieceType.PAWN, 54);
            pieceAlignment.put(PieceType.PAWN, 55);
            pieceAlignment.put(PieceType.ROOK, 56);
            pieceAlignment.put(PieceType.KNIGHT, 57);
            pieceAlignment.put(PieceType.BISHOP, 58);
            pieceAlignment.put(PieceType.QUEEN, 59);
            pieceAlignment.put(PieceType.KING, 60);
            pieceAlignment.put(PieceType.BISHOP, 61);
            pieceAlignment.put(PieceType.KNIGHT, 62);
            pieceAlignment.put(PieceType.ROOK, 63);
            //this.pieceAlignment.addAll(currentPieces.getStageUnlockedPieces());
        }

        public Multimap<PieceType, Integer> getPieceAlignment() {
            return pieceAlignment;
        }
    }
}



