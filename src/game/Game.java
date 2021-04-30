package game;

import gameBoard.Board;
import characters.*;
import menu.*;

import java.util.Scanner;

public class Game {
    Scanner clavier;
    private Peasant player;

  /*  public void playGame() {
        MenuText text = new MenuText();
        Board board = new Board();
        Menu menu = new Menu();

        while (board.getCell() < board.getNbCase()) {
            text.rollDice();
            String lanceDe = clavier.next();
            if (lanceDe.equals("o")) {
                int diceValue = player.throwDice();
                board.setCell(board.getCell() + diceValue);
                System.out.println(" ---------------------------------------------------");
                System.out.println("        Vous lancez le dé et faites un... " + diceValue + " !");
                System.out.println("        Vous avancez jusqu'à la case " + board.getCell() + ".");
                System.out.println(" ---------------------------------------------------");
            } else {
                text.exitGame();
            }
        }
        System.exit(0);
    }
*/
}
