package com.chesssimulator;


import com.chesssimulator.models.*;

public class ChessPieceFactory {

    public ChessPiece getChessPiece(final String name){
        if(name == null)
            throw new IllegalArgumentException("Invalid Chess Piece Name. Chess Piece Name cannot be null");

        if (name.equalsIgnoreCase(CommonConstants.ChessPieces.ROOK))
            return new Rook();

        if (name.equalsIgnoreCase(CommonConstants.ChessPieces.PAWN))
            return new Pawn();

        if (name.equalsIgnoreCase(CommonConstants.ChessPieces.HORSE))
            return new Horse();

        if (name.equalsIgnoreCase(CommonConstants.ChessPieces.KING))
            return new King();

        if (name.equalsIgnoreCase(CommonConstants.ChessPieces.BISHOP))
            return new Bishop();

        if (name.equalsIgnoreCase(CommonConstants.ChessPieces.QUEEN))
            return new Queen();

        throw new IllegalArgumentException("Invalid Chess Piece Name");
    }

}
