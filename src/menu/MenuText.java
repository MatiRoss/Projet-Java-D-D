package menu;

public class MenuText {

    public void launchMenu() {
        System.out.println("");
        System.out.println(" _____________________________________________________________________________________");
        System.out.println("|___|___|___|___|___| Bienvenue dans D&D: THE RETURN OF VARKNIGHT |___|___|___|___|___|");
        System.out.println("");
        System.out.println("");
        System.out.println("CREATION DU PERSONNAGE");
        System.out.println(" ________________________________________");
        System.out.println("Quelle personnage souhaitez-vous incarner?");
        System.out.println(" ----------------------------------------");
        System.out.println("");
        System.out.println("[1] Guerrier");
        System.out.println("[2] Magicien");
        System.out.println("[3] Quitter le jeu");
        System.out.println("");
    }

    public void nameChoice() {
        System.out.println("");
        System.out.println(" ________________________________________");
        System.out.println("Veuillez saisir le nom de votre personnage");
        System.out.println(" ----------------------------------------");
        System.out.println("(ou tapez 'q' pour quitter le jeu)");
        System.out.println("");
    }

    public void checkName() {
        System.out.println(" ____________________________________________________________________");
        System.out.println("(Taper 'o' pour confirmer, 'n' pour modifier ou 'q' pour quitter le jeu)");
        System.out.println("");
    }

    public void finalName() {
        System.out.println("");
        System.out.println("Veuillez taper le nom (définitif!) de votre personnage");
        System.out.println("");
    }

    public void whiteSpace() {
        System.out.println("");
        System.out.println("");
    }

    public void launchGame() {
        System.out.println("______________________________________");
        System.out.println("Êtes-vous prêt à vivre une aventure...");
        System.out.println("         ...pas si palpitante que ça?");
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("(Tapez 'o' pour commencer le jeu ou 'n' pour quitter le jeu)");
        System.out.println("");
        System.out.println("");

    }

    public void rollDice() {
        System.out.println("");
        System.out.println("Voulez-vous lancer le dé?");
        System.out.println("(Tapez 'o' pour lancer le dé, ou 'n' pour quitter le jeu)");
    }

    public void exitGame() {
        System.out.println("Navré de vous voir déjà partir, peut être n'étiez-vous pas de taille...");
        System.exit(0);
    }
}






