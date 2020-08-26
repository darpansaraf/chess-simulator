package com.chesssimulator;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("===================");
        System.out.println("This program simulates the movement of each unique chess piece on an empty chessboard.");
        System.out.println("It expects input in the format <valid_chess_piece_name><space><position>)");
        System.out.println("Ex: King D5");
        System.out.println("In the position the first character is the column and the second is the row of the chess board");
        System.out.println("This program throws a runtime exception along with the cause if invalid input is provided");
        System.out.println("===================");
        System.out.println("Enter Type and Position of Chess Piece(Ex: King D5):");

        String input = new Scanner(System.in).nextLine();
        String possibleMoves = ChessSimulator.getInstance().simulateMoves(input);
        System.out.println(possibleMoves);

    }


}
