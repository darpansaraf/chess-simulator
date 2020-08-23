package com.chesssimulator.models;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column){
        this.row = row;
        this.column = column;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getDisplayPosition(){
        int unicode = 65;
        char character = (char) (unicode + this.column);
        return String.valueOf(character) + this.getRow();
    }
}
