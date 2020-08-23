package com.chesssimulator.models;

import com.chesssimulator.CommonConstants;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pawn extends ChessPiece {

    public Pawn() {
        super(CommonConstants.ChessPieces.PAWN);
    }

    @Override
    public List<Position> makeAMove(Position currentPosition) {

        List<Position> possiblePositions = new ArrayList<>();

        possiblePositions.add(new Position(currentPosition.getRow() + 1, currentPosition.getColumn()));
        possiblePositions.add(new Position(currentPosition.getRow() + 1, currentPosition.getColumn() + 1));
        possiblePositions.add(new Position(currentPosition.getRow() + 1, currentPosition.getColumn() - 1));

        possiblePositions.add(new Position(currentPosition.getRow() - 1, currentPosition.getColumn()));
        possiblePositions.add(new Position(currentPosition.getRow() - 1, currentPosition.getColumn() + 1));
        possiblePositions.add(new Position(currentPosition.getRow() - 1, currentPosition.getColumn() - 1));

        return possiblePositions.stream().filter(x -> (x.getRow() < CommonConstants.ChessBoard.MAX_ROWS && x.getRow() >= 0) && (x.getColumn() < CommonConstants.ChessBoard.MAX_COLUMNS && x.getColumn() >= 0)).collect(Collectors.toList());
    }


}
