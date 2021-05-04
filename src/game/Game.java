package game;

import characters.Character;
import enemies.Ennemy;
import menu.*;
import gameBoard.Board;
import game.Cell;

import java.util.Scanner;

public class Game {

    private Menu menu;
    private Scanner keyboard;
    private MenuText text;
    private Board board;
    private Cell cell;

    public Game(Menu menu) {
        this.menu = menu;
        keyboard = new Scanner(System.in);
        text = new MenuText();
        board = new Board();
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

        while (board.getPlayerPosition() <= board.getBoard().size()) {
            try {
                text.rollDice();
                String lanceDe = keyboard.next();
                if (lanceDe.equals("o")) {
                    int diceValue = menu.getPlayer().throwDice();
                    board.setPlayerPosition(board.getPlayerPosition() + diceValue);
                    System.out.println(menu.getPlayer().getName() + " a " + menu.getPlayer().getHp() + " points de vie et " + menu.getPlayer().getAttack() + " d'attaque");
                    System.out.println(" ---------------------------------------------------");
                    System.out.println("        Vous lancez le dé et faites un... " + diceValue + " !");
                    if (board.getPlayerPosition() < board.getBoard().size()) {
                        System.out.println("        Vous avancez jusqu'à la case " + board.getPlayerPosition() + ".");
                        System.out.println(" ---------------------------------------------------");
                        System.out.println(board.getBoard().get(board.getPlayerPosition()).toString());
                        Cell cell = board.getBoard().get(board.getPlayerPosition());

                        cell.interaction(menu.getPlayer());


                    } else if (board.getPlayerPosition() > board.getBoard().size()) {
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
                board.setPlayerPosition(board.getBoard().size());
                System.out.println("        Vous avancez jusqu'à la case " + board.getPlayerPosition() + ".");
                System.out.println(" ---------------------------------------------------");
                text.youWin();
            }
        }
        System.exit(0);
    }
}
