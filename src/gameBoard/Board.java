package gameBoard;

import enemies.*;
import equipments.*;
import game.*;

import java.util.ArrayList;

public class Board {
    private int playerPosition;
    private ArrayList<Cell> board;

    private int nbGobelins;
    private int nbSorcerers;
    private int nbDragons;
    private int nbClubs;
    private int nbSwords;
    private int nbThunderstrike;
    private int nbFireBalls;
    private int nbHealthPotions;
    private int nbBigHealthPotions;

    private String difficulty;

    public Board() {
        board = new ArrayList<Cell>();

        this.nbGobelins = 10;
        this.nbSorcerers = 10;
        this.nbDragons = 4;
        this.nbClubs = 5;
        this.nbSwords = 4;
        this.nbThunderstrike = 5;
        this.nbFireBalls = 2;
        this.nbHealthPotions = 6;
        this.nbBigHealthPotions = 2;

        generateBoard();
    }

    public Board(String difficulty) {
        board = new ArrayList<Cell>();

        this.nbGobelins = 15;
        this.nbSorcerers = 15;
        this.nbDragons = 8;
        this.nbClubs = 5;
        this.nbSwords = 4;
        this.nbThunderstrike = 5;
        this.nbFireBalls = 2;
        this.nbHealthPotions = 6;
        this.nbBigHealthPotions = 2;

        generateBoard();
    }

    public void generateBoard() {
        for (int i = 0; i < nbGobelins; i++) {
            board.add(new Gobelin());
        }
        for (int i = 0; i < nbSorcerers; i++) {
            board.add(new Sorcerer());
        }
        for (int i = 0; i < nbDragons; i++) {
            board.add(new Dragon());
        }
        for (int i = 0; i < nbClubs; i++) {
            board.add(new Club());
        }
        for (int i = 0; i < nbSwords; i++) {
            board.add(new Sword());
        }
        for (int i = 0; i < nbThunderstrike; i++) {
            board.add(new Thunderstrike());
        }
        for (int i = 0; i < nbFireBalls; i++) {
            board.add(new Fireball());
        }
        for (int i = 0; i < nbHealthPotions; i++) {
            board.add(new HealthPotion());
        }
        for (int i = 0; i < nbBigHealthPotions; i++) {
            board.add(new BigHealthPotion());
        }
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