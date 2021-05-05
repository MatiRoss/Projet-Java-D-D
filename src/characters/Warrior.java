package characters;

import equipments.*;

public class Warrior extends Character {

    Club club;
    Sword sword;
    Shield shield;

    public Warrior() {
    }

    public Warrior(String name) {
        super(name, 5, 5, 10, 10);
    }

    public String toString() {
        return super.toString();
    }
}
