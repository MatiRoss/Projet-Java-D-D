package game;

import characters.Character;
import enemies.Ennemy;
import menu.*;

public abstract class Cell {

    public Cell() {
    }

    public abstract void interaction(Character player);

}

