package game;

import characters.Character;
import menu.*;
import gameBoard.Board;
import tools.Timer;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private Character player;
    private Scanner keyboard;
    private Board board;

    private MenuText text;
    private Timer timer;

    public Game(Character player) {
        timer = new Timer();
        this.player = player;
        keyboard = new Scanner(System.in);
        text = new MenuText();
        board = new Board("hard");
        Collections.shuffle(board.getBoard(), new Random());
    }

    public void playGame() throws Exception {

        while (board.getPlayerPosition() < board.getBoard().size() && player.getHp() > 0) {
            try {
                timer.waitSec(5, true, true);
                text.rollDice();
                int diceValue = player.throwDice();
                String lanceDe = keyboard.next();
                if (lanceDe.equals("o")) {
                    board.setPlayerPosition(board.getPlayerPosition() + diceValue);
                    System.out.println(" ---------------------------------------------------");
                    System.out.println("        Vous lancez le dé et faites un... " + diceValue + " !");
                    if (board.getPlayerPosition() < board.getBoard().size()) {
                        System.out.println("        Vous avancez jusqu'à la case " + board.getPlayerPosition() + ".");
                        System.out.println(" ---------------------------------------------------");
                        System.out.println(player.getName() + " ==>  PV : " + player.getHp() + " ATK : " + player.getAttack());
                        System.out.println(" ---------------------------------------------------");
                        System.out.println(board.getBoard().get(board.getPlayerPosition()).toString());

                        Cell cell = board.getBoard().get(board.getPlayerPosition());
                        cell.interaction(player);

                    } else if (board.getPlayerPosition() > board.getBoard().size()) {
                        throw new CharacterOutOfBoard();
                    }
                } else if (lanceDe.equals("r")) {
                    startNewGame();
                } else {
                    exitGame();
                }
            } catch (CharacterOutOfBoard e) {
                board.setPlayerPosition(board.getBoard().size());
                System.out.println("        Vous avancez jusqu'à la case " + board.getPlayerPosition() + ".");
                System.out.println(" ---------------------------------------------------");
            }
        }
        if (player.getHp() <= 0) {
            restartChoice();
        }
        text.youWin();
        restartChoice();
    }

    public void startNewGame() throws Exception {
        text.launchGame();
        board.setPlayerPosition(0);
        player.setHp(player.getHpMin());
        player.setAttack(player.getAttackMin());
        this.board = new Board();
        playGame();
    }

    public void restartGame() throws Exception {
        text.launchGame();
        board.setPlayerPosition(0);
        this.board = new Board();
        playGame();
    }

    public void restartChoice() throws Exception {
        System.out.println("Voulez-vous réessayer?          OUI ('o')      NON ('n')");
        String restartChoice = keyboard.next();
        if (restartChoice.equals("o")) {
            startNewGame();
        } else {
            exitGame();
        }
    }

    public void exitGame() {
        System.out.println("Navré de vous voir déjà partir, peut être n'étiez-vous pas de taille...");
        System.exit(0);
    }
}
