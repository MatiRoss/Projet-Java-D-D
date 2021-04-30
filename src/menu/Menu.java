package menu;

import java.util.Scanner;
import characters.*;
import gameBoard.Board;

public class Menu {
    Scanner clavier;
    private Peasant player;

    public Menu() {
        this.player = null;
    }

    public void createCharacter() {
        clavier = new Scanner(System.in);
        MenuUtils launcher = new MenuUtils();
        launcher.launchMenu();

        boolean choice = true;

        while (choice) {
            int playerCharacter = clavier.nextInt();
            if (playerCharacter == 1) {
                System.out.println("Veuillez taper le nom de votre personnage ou tapez 'q' pour quitter le jeu");
                String playerName = clavier.next();
                if (playerName.equals("q")) {
                    launcher.exitGame();
                }
                System.out.println("Votre personnage s'appelera " + playerName + ", êtes-vous sûr(e) de votre choix? Taper 'o' pour confirmer, 'n' pour modifier ou 'q' pour quitter le jeu");
                String playerChoice = clavier.next();
                switch (playerChoice) {
                    case "o": {
                        player = new Guerrier(playerName);
                        System.out.println(player.toString());
                        break;
                    }
                    case "n": {
                        System.out.println("Veuillez taper le nom (définitif!) de votre personnage");
                        String playerName2 = clavier.next();
                        player = new Guerrier(playerName);
                        System.out.println(player.toString());
                        break;
                    }
                    case "q": {
                        launcher.exitGame();
                    }
                }
                choice = false;
            } else if (playerCharacter == 2) {
                System.out.println("Veuillez taper le nom de votre personnage ou tapez 'q' pour quitter le jeu");
                String playerName = clavier.next();
                if (playerName.equals("q")) {
                    launcher.exitGame();
                }
                System.out.println("Votre personnage s'appelera " + playerName + ", êtes-vous sûr(e) de votre choix? Taper 'o' pour confirmer, 'n' pour modifier ou 'q' pour quitter le jeu");
                String playerChoice = clavier.next();
                switch (playerChoice) {
                    case "o": {
                        player = new Magicien(playerName);
                        System.out.println(player.toString());
                        break;
                    }
                    case "n": {
                        System.out.println("Veuillez taper le nom (définitif!) de votre personnage");
                        String playerName2 = clavier.next();
                        player = new Magicien(playerName2);
                        System.out.println(player.toString());
                        break;
                    }
                    case "q": {
                        launcher.exitGame();
                    }
                }
                choice = false;
            } else if (playerCharacter == 3) {
                launcher.exitGame();
            } else {
                System.out.println("Veuillez taper 1,2 ou 3 et pas autre chose!!");
            }
        }
    }

    public void playGame() {
        MenuUtils launcher = new MenuUtils();
        Board board = new Board();

        while (board.getCell() < board.getNbCase()) {
            System.out.println("Voulez-vous lancer le dé? Taper 'oui' ou 'non' ");
            String lanceDe = clavier.next();
            if (lanceDe.equals("oui")) {
                int diceValue = player.throwDice();
                board.setCell(board.getCell() + diceValue);
                System.out.println("Vous lancez le dé et faites un " + diceValue);
                System.out.println("Vous avancez à la case " + board.getCell());
            } else {
                launcher.exitGame();
            }
        }
        System.exit(0);
    }

}
