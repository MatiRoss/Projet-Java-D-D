package game;

import characters.Character;
import menu.*;
import gameBoard.Board;

import java.util.Scanner;

public class Game {

    private Character player;
    private Scanner keyboard;
    private MenuText text;
    private Board board;


    public Game(Character player) {
        this.player = player;
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

        while (board.getPlayerPosition() <= board.getBoard().size() && player.getHp() > 0) {
            try {
                text.rollDice();
                String lanceDe = keyboard.next();
                if (lanceDe.equals("o")) {
                    int diceValue = player.throwDice();
                    board.setPlayerPosition(board.getPlayerPosition() + diceValue);
                    System.out.println(player.getName() + " a " + player.getHp() + " points de vie et " + player.getAttack() + " d'attaque");
                    System.out.println(" ---------------------------------------------------");
                    System.out.println("        Vous lancez le dé et faites un... " + diceValue + " !");
                    if (board.getPlayerPosition() < board.getBoard().size()) {
                        System.out.println("        Vous avancez jusqu'à la case " + board.getPlayerPosition() + ".");
                        System.out.println(" ---------------------------------------------------");
                        System.out.println(board.getBoard().get(board.getPlayerPosition()).toString());
                        Cell cell = board.getBoard().get(board.getPlayerPosition());

                        cell.interaction(player);

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
            }
        }
        if (player.getHp() < 0) {
            System.out.println("Vous êtes mort... Perdu!");
        } else {
            text.youWin();
            System.exit(0);
        }
    }
}
