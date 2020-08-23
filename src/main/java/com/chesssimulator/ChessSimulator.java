package com.chesssimulator;

import com.chesssimulator.models.ChessPiece;
import com.chesssimulator.models.Position;

import java.util.List;
import java.util.stream.Collectors;

public class ChessSimulator {

    public String simulateMoves(String input){

        String[] tokens = input.split(" ");

        if(tokens.length > 1) {
            try {
                String chessPieceName = validateAndGetChessPieceName(tokens[0]);
                Position chessPiecePosition = validateAndGetChessPiecePosition(tokens[1]);

                ChessPiece chessPiece = new ChessPieceFactory().getChessPiece(chessPieceName);
                List<Position> possiblePositions = chessPiece.makeAMove(chessPiecePosition);

                return possiblePositions.stream().map(Position::getDisplayPosition).collect(Collectors.joining(","));
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
        else
            throw new RuntimeException("Invalid Input");

        return null;
    }

    private static Position validateAndGetChessPiecePosition(String input) {
        char[] positionAsCharArray = input.toCharArray();
        int column = ((int) positionAsCharArray[0] - 65) - 1; //Indexing starts from 0
        int row = Integer.parseInt(String.valueOf(positionAsCharArray[1]));

        if (row > CommonConstants.ChessBoard.MAX_ROWS || column > CommonConstants.ChessBoard.MAX_COLUMNS)
            throw new RuntimeException("Invalid Position");

        return new Position(row, column);
    }

    private static String validateAndGetChessPieceName(String input) {
        String chessPiece = null;
        switch (input.toLowerCase()) {
            case "king":
                chessPiece = CommonConstants.ChessPieces.KING;
                break;
            case "queen":
                chessPiece = CommonConstants.ChessPieces.QUEEN;
                break;
            case "bishop":
                chessPiece = CommonConstants.ChessPieces.BISHOP;
                break;
            case "horse":
                chessPiece = CommonConstants.ChessPieces.HORSE;
                break;
            case "rook":
                chessPiece = CommonConstants.ChessPieces.ROOK;
                break;
            case "pawn":
                chessPiece = CommonConstants.ChessPieces.PAWN;
                break;
        }
        if (chessPiece == null)
            throw new RuntimeException("Invalid Chess Piece Name");
        return chessPiece;
    }

}
