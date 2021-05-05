package characters;

import equipments.*;

public class Wizard extends Character {

    Thunderstrike thunderstrike;
    Fireball fireball;
    Philter philter;

    public Wizard(String name) {
        super(name, 3, 8, 6, 15);
    }

    public String toString() {
        return super.toString();
    }
}
