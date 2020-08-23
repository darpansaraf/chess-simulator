package com.chesssimulator.models;


import com.chesssimulator.CommonConstants;

import java.util.ArrayList;
import java.util.List;

public class Rook extends ChessPiece {

    public Rook() {
        super(CommonConstants.ChessPieces.ROOK);
    }


    @Override
    public List<Position> makeAMove(Position currentPosition) {
        List<Position> possiblePositions = new ArrayList<>();

        for (int row = currentPosition.getRow() + 1; row < CommonConstants.ChessBoard.MAX_ROWS; row++)
            possiblePositions.add(new Position(row, currentPosition.getColumn()));

        for (int row = currentPosition.getRow() - 1; row >= 0; row--)
            possiblePositions.add(new Position(row, currentPosition.getColumn()));

        for (int col = currentPosition.getColumn() + 1; col < CommonConstants.ChessBoard.MAX_COLUMNS; col++)
            possiblePositions.add(new Position(currentPosition.getRow(), col));

        for (int col = currentPosition.getColumn() - 1; col >= 0; col--)
            possiblePositions.add(new Position(currentPosition.getRow(), col));

        return possiblePositions;
    }
}
