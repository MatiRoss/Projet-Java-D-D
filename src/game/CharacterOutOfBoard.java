package game;

public class CharacterOutOfBoard extends Exception {


    public CharacterOutOfBoard() {
        super("Erreur, personnage en dehors du plateau");
    }
}
