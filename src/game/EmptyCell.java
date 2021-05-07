package game;

import characters.Character;

public class EmptyCell extends Cell {

    public EmptyCell() {
    }

    @Override
    public void interaction(Character player, Cell cell) {

    }

    @Override
    public String toString() {
        return "Vous tombez sur une case vide. Un peu de répit pour vous.";
    }
}
