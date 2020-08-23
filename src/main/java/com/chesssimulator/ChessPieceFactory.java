package com.chesssimulator;


import com.chesssimulator.models.*;

public class ChessPieceFactory {

    public ChessPiece getChessPiece(String name){
        if(name == null)
            return null;

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

        return null;
    }

}
