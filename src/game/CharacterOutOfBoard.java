package game;

/**
 * Exception type class if the player gets out of the board
 */
public class CharacterOutOfBoard extends Exception {

    public CharacterOutOfBoard() {
        super("Erreur, personnage en dehors du plateau");
    }
}
