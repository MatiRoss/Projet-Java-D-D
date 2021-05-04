package gameBoard;

import enemies.*;
import equipments.*;
import game.*;

import java.util.ArrayList;

public class Board {

    private int playerPosition;
    private ArrayList<Cell> board;

    public Board() {
        board = new ArrayList<Cell>();

        Ennemy gobelin = new Gobelin();
        Ennemy sorcerer = new Sorcerer();
        Ennemy dragon = new Dragon();
        HealthPotion potion = new HealthPotion();
        BigHealthPotion bigPotion = new BigHealthPotion();
        Weapons club = new Club();
        Weapons sword = new Sword();
        Protections shield = new Shield();
        EmptyCell emptyCell = new EmptyCell();

        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);
        board.add(gobelin);


    }

    public ArrayList<Cell> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<Cell> board) {
        this.board = board;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }
}