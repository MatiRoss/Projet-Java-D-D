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

        board.add(new Thunderstrike());
        board.add(new Club());
        board.add(new EmptyCell());
        board.add(new Gobelin());
        board.add(new Thunderstrike());
        board.add(new Club());
        board.add(new Gobelin());
        board.add(new HealthPotion());
        board.add(new Gobelin());
        board.add(new Gobelin());
        board.add(new Sorcerer());
        board.add(new Club());
        board.add(new Gobelin());
        board.add(new HealthPotion());
        board.add(new Gobelin());
        board.add(new Gobelin());
        board.add(new Thunderstrike());
        board.add(new EmptyCell());
        board.add(new Gobelin());
        board.add(new Sword());
        board.add(new Sorcerer());
        board.add(new Gobelin());
        board.add(new Club());
        board.add(new Thunderstrike());
        board.add(new Gobelin());
        board.add(new Sorcerer());
        board.add(new Sword());
        board.add(new Gobelin());
        board.add(new BigHealthPotion());
        board.add(new EmptyCell());
        board.add(new Gobelin());
        board.add(new HealthPotion());
        board.add(new Sorcerer());
        board.add(new HealthPotion());
        board.add(new EmptyCell());
        board.add(new Sorcerer());
        board.add(new Sorcerer());
        board.add(new Sorcerer());
        board.add(new Club());
        board.add(new HealthPotion());
        board.add(new Sorcerer());
        board.add(new BigHealthPotion());
        board.add(new Sword());
        board.add(new HealthPotion());
        board.add(new Sorcerer());
        board.add(new Dragon());
        board.add(new EmptyCell());
        board.add(new Sorcerer());
        board.add(new Fireball());
        board.add(new Fireball());
        board.add(new EmptyCell());
        board.add(new EmptyCell());
        board.add(new Dragon());
        board.add(new Sword());
        board.add(new EmptyCell());
        board.add(new EmptyCell());
        board.add(new Dragon());
        board.add(new EmptyCell());
        board.add(new EmptyCell());
        board.add(new Shield());
        board.add(new Philter());
        board.add(new Shield());
        board.add(new Dragon());
        board.add(new EmptyCell());
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