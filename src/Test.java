import characters.Warrior;
import enemies.Ennemy;
import game.Cell;

import java.util.ArrayList;

public class Test {
    private ArrayList<Cell> testBoard = new ArrayList<Cell>();

    public Test() {

    }

    public ArrayList<Cell> getTestBoard() {
        return testBoard;
    }

    public void addToBoard() {
        Cell cell = new Cell();
        testBoard.add(cell);
        testBoard.add(1, cell);
        System.out.println(testBoard);
    }
}
