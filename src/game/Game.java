package game;

import characters.*;
import gameBoard.Board;
import game.CharacterOutOfBoard;
import game.Cell;

import java.util.ArrayList;
import java.util.Scanner;

import menu.*;

import java.util.Scanner;

public class Game {
    private Menu menu;
    private Scanner keyboard;
    private MenuText text;


    public Game(Menu menu) {
        this.menu = menu;
        keyboard = new Scanner(System.in);
        text = new MenuText();
    }

    public void gameMenu() throws Exception {
        String start = keyboard.next();
        if (start.equalsIgnoreCase("o")) {
            playGame();
        } else {
            text.exitGame();
        }
    }

    public void playGame() throws Exception {

        Board board = new Board();

        while (board.getCell() < board.getNbCase()) {
            try {
                text.rollDice();
                String lanceDe = keyboard.next();
                if (lanceDe.equals("o")) {
                    int diceValue = menu.getPlayer().throwDice();
                    board.setCell(board.getCell() + diceValue);
                    System.out.println(menu.getPlayer().getName() + " a " + menu.getPlayer().getHp() + " points de vie et " + menu.getPlayer().getAttack() + " d'attaque");
                    System.out.println(" ---------------------------------------------------");
                    System.out.println("        Vous lancez le dé et faites un... " + diceValue + " !");
                    if (board.getCell() < board.getNbCase()) {
                        System.out.println("        Vous avancez jusqu'à la case " + board.getCell() + ".");
                        System.out.println(" ---------------------------------------------------");
                    } else if (board.getCell() > board.getBoard().length) {
                        throw new CharacterOutOfBoard();
                    }
                } else if (lanceDe.equals("r")) {
                    text.launchGame();
                    gameMenu();
                    playGame();
                } else {
                    text.exitGame();
                }
            } catch (CharacterOutOfBoard e) {
                board.setCell(board.getBoard().length);
                System.out.println("        Vous avancez jusqu'à la case " + board.getCell() + ".");
                System.out.println(" ---------------------------------------------------");
                text.youWin();
            }
        }
        System.exit(0);
    }


}
