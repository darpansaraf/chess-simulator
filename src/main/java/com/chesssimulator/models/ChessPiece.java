package com.chesssimulator.models;

import java.util.List;

public abstract class ChessPiece {
    private String name;

    public ChessPiece(String name){
        this.name = name;
    }

    public abstract List<Position> makeAMove(Position currentPosition);
}
