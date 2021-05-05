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

        board.add(0, new Thunderstrike());
        board.add(1,  new Club());
        board.add(2, new EmptyCell());
        board.add(3,  new Gobelin());
        board.add(4, new Thunderstrike());
        board.add(5,  new Club());
        board.add(6,  new Gobelin());
        board.add(7,  new HealthPotion());
        board.add(8, new Gobelin());
        board.add(9,  new Gobelin());
        board.add(10, new Sorcerer());
        board.add(11,  new Club());
        board.add(12,  new Gobelin());
        board.add(13,  new HealthPotion());
        board.add(14, new Gobelin());
        board.add(15,  new Gobelin());
        board.add(16, new Thunderstrike());
        board.add(17, new EmptyCell());
        board.add(18,  new Gobelin());
        board.add(19,  new Sword());
        board.add(20, new Sorcerer());
        board.add(21,  new Gobelin());
        board.add(22,  new Club());
        board.add(23, new Thunderstrike());
        board.add(24,  new Gobelin());
        board.add(25, new Sorcerer());
        board.add(26,  new Sword());
        board.add(27,  new Gobelin());
        board.add(28, new BigHealthPotion());
        board.add(29, new EmptyCell());
        board.add(30,  new Gobelin());
        board.add(31,  new HealthPotion());
        board.add(32, new Sorcerer());
        board.add(33,  new HealthPotion());
        board.add(34, new EmptyCell());
        board.add(35, new Sorcerer());
        board.add(36, new Sorcerer());
        board.add(37, new Sorcerer());
        board.add(38,  new Club());
        board.add(39,  new HealthPotion());
        board.add(40, new Sorcerer());
        board.add(41, new BigHealthPotion());
        board.add(42,  new Sword());
        board.add(43,  new HealthPotion());
        board.add(44, new Sorcerer());
        board.add(45,  new Dragon());
        board.add(46, new EmptyCell());
        board.add(47, new Sorcerer());
        board.add(48, new Fireball());
        board.add(49, new Fireball());
        board.add(50, new EmptyCell());
        board.add(51, new EmptyCell());
        board.add(52,  new Dragon());
        board.add(53,  new Sword());
        board.add(54, new EmptyCell());
        board.add(55, new EmptyCell());
        board.add(56,  new Dragon());
        board.add(57, new EmptyCell());
        board.add(58, new EmptyCell());
        board.add(59,  new Shield());
        board.add(60, new Philter());
        board.add(61,  new Shield());
        board.add(62,  new Dragon());
        board.add(63, new EmptyCell());


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