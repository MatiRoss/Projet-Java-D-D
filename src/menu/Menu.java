package menu;

import java.util.Scanner;

import classes.Guerrier;
import classes.Magicien;

public class Menu {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Quelle personnage souhaitez-vous incarner? Taper 1 pour choisir un guerrier, taper 2 pour choisir un magicien ou 3 pour quitter le jeu");

        boolean choice = true;

        while (choice) {
            int playerCharacter = clavier.nextInt();

            if (playerCharacter == 1) {
                System.out.println("Veuillez taper le nom de votre personnage ou tapez 'q' pour quitter le jeu");
                String playerName = clavier.next();
                if (playerName.equals("q")) {
                    System.out.println("Navré de vous voir déjà partir, peut être n'étiez-vous pas de taille...");
                    System.exit(0);
                }
                System.out.println("Votre personnage s'appelera " + playerName + ", êtes-vous sûr(e) de votre choix? Taper 'o' pour confirmer, 'n' pour modifier ou 'q' pour quitter le jeu");
                String playerChoice = clavier.next();
                switch (playerChoice) {
                    case "o" :{
                        Guerrier guerrier = new Guerrier(playerName);
                        System.out.println(guerrier.toString());
                        break;
                    }
                    case "n" : {
                        System.out.println("Veuillez taper le nom (définitif!) de votre personnage");
                        String playerName2 = clavier.next();
                        Guerrier guerrier = new Guerrier(playerName2);
                        System.out.println(guerrier.toString());
                        break;
                    }
                    case "q": {
                        System.out.println("Navré de vous voir déjà partir, peut être n'étiez-vous pas de taille...");
                        System.exit(0);
                    }
                }
                choice = false;
            } else if (playerCharacter == 2) {
                System.out.println("Veuillez taper le nom de votre personnage ou tapez 'q' pour quitter le jeu");
                String playerName = clavier.next();
                if (playerName.equals("q")) {
                    System.out.println("Navré de vous voir déjà partir, peut être n'étiez-vous pas de taille...");
                    System.exit(0);
                }
                System.out.println("Votre personnage s'appelera " + playerName + ", êtes-vous sûr(e) de votre choix? Taper 'o' pour confirmer, 'n' pour modifier ou 'q' pour quitter le jeu");
                String playerChoice = clavier.next();
                switch (playerChoice) {
                    case "o" : {
                        Magicien magicien = new Magicien(playerName);
                        System.out.println(magicien.toString());
                        break;
                    }
                    case "n" : {
                        System.out.println("Veuillez taper le nom (définitif!) de votre personnage");
                        String playerName2 = clavier.next();
                        Magicien magicien = new Magicien(playerName2);
                        System.out.println(magicien.toString());
                        break;
                    }
                    case "q" :{
                        System.out.println("Navré de vous voir déjà partir, peut être n'étiez-vous pas de taille...");
                        System.exit(0);
                    }
                }
                choice = false;
            } else if (playerCharacter == 3) {
                System.out.println("Navré de vous voir déjà partir, peut être n'étiez-vous pas de taille...");
                System.exit(0);
            } else {
                System.out.println("Veuillez taper 1,2 ou 3 et pas autre chose!!");
            }

        }
        System.out.println("...C'est parti!");
    }
}
