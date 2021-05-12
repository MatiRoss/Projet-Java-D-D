package game;

import characters.Character;
import characters.Inventory;
import enemies.Ennemy;
import enemies.Rat;
import menu.*;
import gameBoard.Board;
import tools.Timer;

import java.util.Arrays;
import java.util.Collections;
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
        board = new Board();
        Collections.shuffle(board.getBoard());
    }

    public void playGame() throws Exception {

        while (board.getPlayerPosition() < board.getBoard().size() && player.getHp() > 0) {
            try {
                timer.waitSec(1, true, true);
                text.rollDice();
                int diceValue = player.throwDice();
                String lanceDe = keyboard.next();
                if (lanceDe.equals("o")) {
                    Cell cell = board.getBoard().get(board.getPlayerPosition());
                    System.out.println(" ---------------------------------------------------");
                    System.out.println("        Vous lancez le dé et faites un... " + diceValue + " !");
                    board.setPlayerPosition(board.getPlayerPosition() + diceValue);
                    if (board.getPlayerPosition() < board.getBoard().size()) {
                        System.out.println("        Vous avancez jusqu'à la case " + board.getPlayerPosition() + ".");
                        System.out.println(" ---------------------------------------------------");
                        System.out.println(cell.eventDescription());
                        System.out.println(" ---------------------------------------------------");
                        if (cell instanceof Ennemy) {
                            System.out.println(player.showStats(player));
                            System.out.println(((Ennemy) cell).showStats());
                            text.FightOrFlee();
                            boolean ennemyChoice = true;
                            while (ennemyChoice) {
                                int fightChoice = keyboard.nextInt();
                                switch (fightChoice) {
                                    case 1:
                                        System.out.println(player.showStats(player));
                                        ennemyChoice = false;
                                        fight(cell, diceValue);
                                        break;
                                    case 2:
                                        System.out.println(player.showStats(player));
                                        ennemyChoice = false;
                                        flee();
                                        break;
                                    case 3:
                                        player.displayInventory(player);
                                        player.useItem(player);
                                }
                            }
                        } else {
                      /*     text.displayInventory();
                            String displayIventory = keyboard.next();
                           if (displayIventory.equals("i")) {
                                player.displayInventory(player);
                                player.useItem(player);
                            }else {

                            }
                           */
                            cell.interaction(player, cell);
                        }
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

    public void fight(Cell cell, int diceValue) {
        ((Ennemy) cell).setDead(false);
        cell.interaction(player, cell);
        if (((Ennemy) cell).isDead()) {
            board.getBoard().set((board.getPlayerPosition() - diceValue), new Rat());
        }
    }

    public void flee() {
        int diceValue2 = player.throwDice();
        int newPosition = board.getPlayerPosition() - diceValue2;
        board.setPlayerPosition(newPosition);
        Cell newCell = board.getBoard().get(newPosition);
        System.out.println("Vous fuyez lâchement... Votre couardise vous ramène à la case " + newPosition + ".");
        System.out.println(" ---------------------------------------------------");
        System.out.println(newCell.eventDescription());
        System.out.println(" ---------------------------------------------------");

        if (newCell instanceof Ennemy) {
            ((Ennemy) newCell).setDead(false);
            System.out.println(player.showStats(player));
            System.out.println(((Ennemy) newCell).showStats());
            newCell.interaction(player, newCell);
            if (((Ennemy) newCell).isDead()) {
                board.getBoard().set((newPosition), new Rat());
            }
        } else {
            newCell.interaction(player, newCell);
        }
    }

    public void exitGame() {
        System.out.println("Navré de vous voir déjà partir, peut être n'étiez-vous pas de taille...");
        System.exit(0);
    }
}
