package com.chesssimulator.models;

public class Box {

    private Position position;
    private ChessPiece chessPiece;

    public Position getPosition() {
        return position;
    }

    public ChessPiece getChessPiece() {
        return chessPiece;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setChessPiece(ChessPiece chessPiece) {
        this.chessPiece = chessPiece;
    }
}
