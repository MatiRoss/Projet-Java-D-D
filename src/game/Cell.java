package game;

import characters.Character;

public abstract class Cell {

    public Cell() {
    }

    public abstract void interaction(Character player, Cell cell);

}

