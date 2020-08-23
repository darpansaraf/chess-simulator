package com.chesssimulator.models;


import com.chesssimulator.CommonConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bishop extends ChessPiece {

    public Bishop() {
        super(CommonConstants.ChessPieces.BISHOP);
    }

    @Override
    public List<Position> makeAMove(Position currentPosition) {
        List<Position> possiblePositions = new ArrayList<>();

        for (int row = currentPosition.getRow() + 1, incCol = currentPosition.getColumn() + 1, decCol = currentPosition.getColumn() - 1; row < CommonConstants.ChessBoard.MAX_ROWS; row++, decCol--, incCol++) {
            possiblePositions.add(new Position(row, incCol));
            possiblePositions.add(new Position(row, decCol));
        }

        for (int row = currentPosition.getRow() - 1, incCol = currentPosition.getColumn() + 1, decCol = currentPosition.getColumn() - 1; row >= 0; row--, decCol--, incCol++) {
            possiblePositions.add(new Position(row, incCol));
            possiblePositions.add(new Position(row, decCol));
        }

        return possiblePositions.stream().filter(x->(x.getRow() < CommonConstants.ChessBoard.MAX_ROWS && x.getRow() >= 0) && (x.getColumn() < CommonConstants.ChessBoard.MAX_COLUMNS && x.getColumn() >= 0)).collect(Collectors.toList());
    }
}
