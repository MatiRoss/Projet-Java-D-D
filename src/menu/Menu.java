package menu;

import java.util.Scanner;

import characters.*;
import gameBoard.Board;


public class Menu {
    private Scanner keyboard;
    private Peasant player;

    public Menu() {
        this.player = null;
    }

    public void createCharacter() {

        keyboard = new Scanner(System.in);
        MenuText text = new MenuText();
        text.launchMenu();
        boolean choice = true;
        while (choice) {
            int playerCharacter = keyboard.nextInt();
            if (playerCharacter == 1) {
                text.nameChoice();
                String playerName = keyboard.next();
                if (playerName.equals("q")) {
                    text.exitGame();
                }
                System.out.println("");
                System.out.println("Votre personnage s'appelera " + playerName + ", êtes-vous sûr(e) de votre choix?");
                text.checkName();
                String playerChoice = keyboard.next();
                switch (playerChoice) {
                    case "o": {
                        player = new Warrior(playerName);
                        System.out.println(player.descriptionWarrior());
                        text.whiteSpace();
                        break;
                    }
                    case "n": {
                        text.finalName();
                        String playerName2 = keyboard.next();
                        player = new Warrior(playerName2);
                        System.out.println(player.descriptionWarrior());
                        text.whiteSpace();
                        break;
                    }
                    case "q": {
                        text.exitGame();
                    }
                }
                choice = false;
            } else if (playerCharacter == 2) {
                text.nameChoice();
                String playerName = keyboard.next();
                if (playerName.equals("q")) {
                    text.exitGame();
                }
                System.out.println("Votre personnage s'appelera " + playerName + ", êtes-vous sûr(e) de votre choix?");
                text.checkName();
                String playerChoice = keyboard.next();
                switch (playerChoice) {
                    case "o": {
                        player = new Wizard(playerName);
                        System.out.println(player.descriptionWizard());
                        text.whiteSpace();
                        break;
                    }
                    case "n": {
                        text.finalName();
                        String playerName2 = keyboard.next();
                        player = new Wizard(playerName2);
                        System.out.println(player.descriptionWizard());
                        text.whiteSpace();
                        break;
                    }
                    case "q": {
                        text.exitGame();
                    }
                }
                choice = false;
            } else if (playerCharacter == 3) {
                text.exitGame();
            } else {
                System.out.println("Veuillez taper 1,2 ou 3 et pas autre chose!!");
            }
        }
        text.launchGame();
        String start = keyboard.next();
        if (start.equalsIgnoreCase("o")) {
            playGame();
        } else {
            text.exitGame();
        }
    }

    public void playGame() {

        MenuText text = new MenuText();
        Board board = new Board();

        while (board.getCell() < board.getNbCase()) {
            text.rollDice();
            String lanceDe = keyboard.next();
            if (lanceDe.equals("o")) {
                int diceValue = player.throwDice();
                board.setCell(board.getCell() + diceValue);
                System.out.println(player.getName() + " a " + player.getHp() + " points de vie et " + player.getAttack() + " d'attaque");
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
}
