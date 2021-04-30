package menu;

import java.util.Scanner;

public class MenuUtils {
    Scanner clavier;

    public void launchMenu() {
        System.out.println("");
        System.out.println(" _____________________________________________________________________________________");
        System.out.println("|___|___|___|___|___| Bienvenue dans D&D: THE RETURN OF VARKNIGHT |___|___|___|___|___|");
        System.out.println("");
        System.out.println("");
        System.out.println("CREATION DU PERSONNAGE");
        System.out.println("");
        System.out.println("Quelle personnage souhaitez-vous incarner?");
        System.out.println("");
        System.out.println("[1] Guerrier");
        System.out.println("[2] Magicien");
        System.out.println("[3] Quitter le jeu");
    }
    public void exitGame() {
        System.out.println("Navré de vous voir déjà partir, peut être n'étiez-vous pas de taille...");
        System.exit(0);
    }
}






