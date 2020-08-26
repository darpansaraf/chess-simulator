package com.chesssimulator;

import com.chesssimulator.exceptions.InvalidInputException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ChessSimulatorTest {

    private static ChessSimulator chessSimulator;
    private static ChessPieceFactory chessPieceFactory;

    @BeforeClass
    public static void initialize() {
        chessSimulator = ChessSimulator.getInstance();
        chessPieceFactory = new ChessPieceFactory();
    }

    @Test(expected = InvalidInputException.class)
    public void invalidChessPieceNameInInputShouldReturnError() {
        chessSimulator.simulateMoves("TestingName D5");
    }

    @Test(expected = InvalidInputException.class)
    public void invalidRowInInputShouldReturnError() {
        chessSimulator.simulateMoves("King DD5");
    }

    @Test(expected = InvalidInputException.class)
    public void invalidColumnInInputShouldReturnError() {
        chessSimulator.simulateMoves("King Z5");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullChessPieceNamePassedToChessPieceFactoryShouldReturnError() {
        chessPieceFactory.getChessPiece(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidChessPieceNamePassedToChessPieceFactoryShouldReturnError() {
        chessPieceFactory.getChessPiece("TestChessPieceName");
    }

    @Test
    public void validInputForKingShouldReturnPossiblePositions() {
        List<String> expected = Arrays.asList("C6", "D6", "E6", "E5", "E4", "D4", "C4", "C5");
        List<String> actual = Arrays.asList(chessSimulator.simulateMoves("King D5").split(","));
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    public void validInputForQueenShouldReturnPossiblePositions() {
        List<String> expected = Arrays.asList("A2", "A3", "A4", "A5", "A6", "A7", "A8", "B2", "C3", "D4", "E5", "F6", "G7", "H8", "B1", "C1", "D1", "E1", "F1", "G1", "H1");
        List<String> actual = Arrays.asList(chessSimulator.simulateMoves("Queen A1").split(","));
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    public void validInputForPawnShouldReturnPossiblePositions() {
        List<String> expected = Arrays.asList("F7");
        List<String> actual = Arrays.asList(chessSimulator.simulateMoves("Pawn F8").split(","));
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    public void validInputForBishopShouldReturnPossiblePositions() {
        List<String> expected = Arrays.asList("E8", "B5", "C6", "A4", "H3", "G4", "F5", "E6", "C8");
        List<String> actual = Arrays.asList(chessSimulator.simulateMoves("Bishop D7").split(","));
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    public void validInputForHorseShouldReturnPossiblePositions() {
        List<String> expected = Arrays.asList("F5", "G4", "G2", "F1", "D1", "C2", "C4", "D5");
        List<String> actual = Arrays.asList(chessSimulator.simulateMoves("Horse E3").split(","));
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    public void validInputForRookShouldReturnPossiblePositions() {
        List<String> expected = Arrays.asList("A6", "H5", "D5", "A7", "E5", "B5", "A4", "A1", "A2", "C5", "A3", "A8", "G5", "F5");
        List<String> actual = Arrays.asList(chessSimulator.simulateMoves("Rook A5").split(","));
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

}
