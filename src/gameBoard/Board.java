package gameBoard;

import java.util.Arrays;

public class Board {
    private int[] board;  // tableau représentant le plateau
    private int i;  // index d'une cellule du tableau

    public Board(int[] board) {
        this.board = new int[63];
    }

    public int[] getBoard() {
        return board;
    }

    public int getI() {
        return i;
    }

    public void setBoard(int[] board) {
        this.board = board;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getCell() {
        return board[i];
    }
}
