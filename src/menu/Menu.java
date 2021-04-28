package menu;

import java.util.Scanner;

import classes.Guerrier;
import classes.Magicien;

public class Menu {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Quelle personnage souhaitez-vous incarner? Taper 1 pour choisir un guerrier, taper 2 pour choisir un magicien");

        boolean choice = true;

        while (choice) {
            int playerCharacter = clavier.nextInt();

            if (playerCharacter == 1) {
                System.out.println("Veuillez taper le nom de votre personnage :");

                String playerName = clavier.next();

                Guerrier guerrier = new Guerrier(playerName);

                System.out.println(guerrier.toString());

                choice = false;
            } else if (playerCharacter == 2) {
                System.out.println("Veuillez taper le nom de votre personnage :");

                String playerName = clavier.next();

                Magicien magicien = new Magicien(playerName);

                System.out.println(magicien.toString());

                choice = false;
            } else {
                System.out.println("Veuillez taper 1 ou 2, et pas autre chose!!");
            }

        }
    }
}
