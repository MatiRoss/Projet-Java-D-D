package menu;

import java.util.Scanner;

import characters.*;
import characters.Character;


public class Menu {
    private Character player;

    public Menu() {
        this.player = null;
    }

    public void createCharacter() {

        Scanner keyboard = new Scanner(System.in);
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

    }

    public Character getPlayer() {
        return player;
    }
}
