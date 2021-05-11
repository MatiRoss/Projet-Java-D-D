package characters;

import equipments.Protections;
import equipments.Weapons;

public class Wizard extends Character {

    private boolean hasThunderstrike;
    private boolean hasFireBall;
    private Weapons weapon;
    private Protections protection;

    public Wizard(String name) {
        super(name, 3, 3, 6, 8, 8, 15, new Inventory());
        this.hasThunderstrike = false;
        this.hasFireBall = false;
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

    public void setHasThunderstrike(boolean hasThunderstrike) {
        this.hasThunderstrike = hasThunderstrike;
    }

    public void setHasFireBall(boolean hasFireBall) {
        this.hasFireBall = hasFireBall;
    }

    public boolean hasThunderstrike() {
        return hasThunderstrike;
    }

    public boolean hasFireBall() {
        return hasFireBall;
    }

    public String toString() {
        return super.toString();
    }
}
