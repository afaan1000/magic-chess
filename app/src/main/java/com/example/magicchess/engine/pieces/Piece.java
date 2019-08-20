package com.example.magicchess.engine.pieces;

import com.example.magicchess.Alliance;
import com.example.magicchess.engine.board.Board;
import com.example.magicchess.engine.board.Move;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class Piece {

    protected final PieceType pieceType;
    protected final int piecePosition;
    protected final Alliance pieceAlliance;
    protected final boolean isFirstMove;
    private final int cachedHashCode;

    Piece(final PieceType pieceType, final int piecePosition, final Alliance pieceAlliance){
        this.pieceType = pieceType;
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
        //TODO more work here!!
        this.isFirstMove = false;
        this.cachedHashCode = computeHashCode();
    }

    private int computeHashCode() {
        int result = pieceType.hashCode();
        result = 31 * result + pieceAlliance.hashCode();
        result = 31 * result + piecePosition;
        result = 31 * result + (isFirstMove ? 1 : 0);
        return result;
    }

    @Override
    public boolean equals(final Object other){
        if (this == other){
            return true;
        }
        if (other instanceof Piece){
            return false;
        }
        final Piece otherPiece = (Piece) other;
        return piecePosition == otherPiece.getPiecePosition() && pieceType == otherPiece.getPieceType() &&
                pieceAlliance == otherPiece.getPieceAlliance() && isFirstMove == otherPiece.isFirstMove();
    }

    @Override
    public int hashCode(){
        return this.cachedHashCode;
    }

    public int getPiecePosition() {
        return piecePosition;
    }

    public Alliance getPieceAlliance(){
        return this.pieceAlliance;
    }

    public boolean isFirstMove() {
        return this.isFirstMove;
    }

    public PieceType getPieceType() {
        return this.pieceType;
    }

    public abstract Collection<Move> calculateLegalMoves(final Board board);

    public abstract Piece movePiece(Move move);

    public enum PieceType{

        PAWN("P"){
            int startPosition;
            @Override
            public boolean isKing(){
                return false;
            }

            @Override
            public boolean isRook() {
                return false;
            }
            @Override
            public List<Integer> getPossibleStartPositions(){
                List<Integer> pieceStartingPositions = new ArrayList<>(Arrays.asList(48, 49, 50, 51, 52, 53, 54, 55));
                return pieceStartingPositions;
            }
            public void setStartPosition(int startPosition){
                this.startPosition = startPosition;
            }
            public int getStartPosition(int startPosition){
                return this.startPosition ;
            }
        },
        KNIGHT("N") {
            int startPosition;
            @Override
            public boolean isKing() {
                return false;
            }

            @Override
            public boolean isRook() {
                return false;
            }
            @Override
            public List<Integer> getPossibleStartPositions(){
                List<Integer> pieceStartingPositions = new ArrayList<>(Arrays.asList(57, 62));
                return pieceStartingPositions;
            }
            public void setStartPosition(int startPosition){
                this.startPosition = startPosition;
            }
            public int getStartPosition(int startPosition){
                return this.startPosition ;
            }
        },
        BISHOP("B") {
            int startPosition;
            @Override
            public boolean isKing() {
                return false;
            }

            @Override
            public boolean isRook() {
                return false;
            }
            @Override
            public List<Integer> getPossibleStartPositions(){
                List<Integer> pieceStartingPositions = new ArrayList<>(Arrays.asList(58, 61));
                return pieceStartingPositions;
            }
            public void setStartPosition(int startPosition){
                this.startPosition = startPosition;
            }
            public int getStartPosition(int startPosition){
                return this.startPosition ;
            }
        },
        ROOK("R") {
            int startPosition;
            @Override
            public boolean isKing() {
                return false;
            }

            @Override
            public boolean isRook() {
                return true;
            }
            @Override
            public List<Integer> getPossibleStartPositions(){
                List<Integer> pieceStartingPositions = new ArrayList<>(Arrays.asList(56, 63));
                return pieceStartingPositions;
            }
            public void setStartPosition(int startPosition){
                this.startPosition = startPosition;
            }
            public int getStartPosition(int startPosition){
                return this.startPosition ;
            }
        },
        QUEEN("Q") {
            int startPosition;
            @Override
            public boolean isKing() {
                return false;
            }

            @Override
            public boolean isRook() {
                return false;
            }
            @Override
            public List<Integer> getPossibleStartPositions(){
                List<Integer> pieceStartingPositions = new ArrayList<>(Arrays.asList(59));
                return pieceStartingPositions;
            }
            public void setStartPosition(int startPosition){
                this.startPosition = startPosition;
            }
            public int getStartPosition(int startPosition){
                return this.startPosition ;
            }
        },
        KING("K") {
            int startPosition;
            @Override
            public boolean isKing() {
                return true;
            }

            @Override
            public boolean isRook() {
                return false;
            }
            @Override
            public List<Integer> getPossibleStartPositions(){
                List<Integer> pieceStartingPositions = new ArrayList<>(Arrays.asList(60));
                return pieceStartingPositions;
            }

            public void setStartPosition(int startPosition){
                this.startPosition = startPosition;
            }
            public int getStartPosition(int startPosition){
                return this.startPosition ;
            }
        };

        private String pieceName;
        PieceType(final String pieceName){
            this.pieceName = pieceName;
        }

        @Override
        public String toString(){
            return this.pieceName;
        }

        public abstract boolean isKing();

        public abstract boolean isRook();

        public abstract List<Integer> getPossibleStartPositions();
    }
}
