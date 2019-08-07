package com.example.magicchess.engine.player;


import java.util.ArrayList;
import java.util.List;

import com.example.magicchess.Pieces;
import com.example.magicchess.engine.pieces.Piece;

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

        List <PieceType> allPieces= new ArrayList<>();
        List <PieceType> playerStagePieces= new ArrayList<>();
        List <PieceType> stageUnlockedPieces= new ArrayList<>();

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
}



