package gameBoard;

public class Board {
    private int[] board;
    private int cell;
    private int nbCase;

    public Board() {
        nbCase = 64;
        cell = 1;
        board = new int[nbCase];
    }

    public int getNbCase() {
        return nbCase;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public int[] getBoard() {
        return board;
    }
}