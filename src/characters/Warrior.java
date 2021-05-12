package characters;

import equipments.Protections;
import equipments.Weapons;

public class Warrior extends Character {

    private boolean hasClub;
    private boolean hasSword;
    private boolean hasBow;
    private Weapons weapon;
    private Protections protection;

    public Warrior() {
    }

    public Warrior(String name) {
        super(name, 5, 5, 10, 5, 5, 10, new Inventory());
        this.hasClub = false;
        this.hasSword = false;
        this.hasBow = false;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public void setProtection(Protections protection) {
        this.protection = protection;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public Protections getProtection() {
        return protection;
    }

    public void setHasBow(boolean hasBow) {
        this.hasBow = hasBow;
    }

    public void setHasClub(boolean hasClub) {
        this.hasClub = hasClub;
    }

    public void setHasSword(boolean hasSword) {
        this.hasSword = hasSword;
    }

    public boolean hasBow() {
        return hasBow;
    }

    public boolean hasClub() {
        return hasClub;
    }

    public boolean hasSword() {
        return hasSword;
    }

    public String toString() {
        return super.toString();
    }
}
