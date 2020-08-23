package com.chesssimulator.models;

public class ChessBoard {

    private Box[][] chessBoard;

    public ChessBoard() {
        chessBoard = new Box[8][8];
        int unicode = 65;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Box box = new Box();
                box.setPosition(new Position(row,col));
                chessBoard[row][col] = box;
            }
        }
    }
}
