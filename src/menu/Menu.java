package menu;

import java.util.Scanner;

import classes.Guerrier;
import classes.Magicien;

public class Menu {

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		System.out.println(
				"Quelle personnage souhaitez-vous incarner? Taper 1 pour choisir un guerrier, taper 2 pour choisir un magicien");

		int playerCharacter = clavier.nextInt();
		clavier.nextLine();

		if (playerCharacter == 1 || playerCharacter == 2) {
			if (playerCharacter == 1) {
				System.out.println("Veuillez choisir le nom de votre personnage");
				String playerName = clavier.next();
				Guerrier guerrier = new Guerrier(playerName);

				System.out.println(guerrier.toString());
			} else {
				System.out.println("Veuillez taper 1 ou 2, et pas autre chose!!");

			}
			if (playerCharacter == 2) {
				System.out.println("Veuillez choisir le nom de votre personnage");
				String playerName = clavier.next();
				Magicien magicien = new Magicien(playerName);

				System.out.println(magicien.toString());
				System.out.println(magicien.toString());
			}

		}
	}

}
