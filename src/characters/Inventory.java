package characters;

import equipments.BigHealthPotion;
import equipments.HealthPotion;
import equipments.Protections;
import equipments.Weapons;
import game.Cell;

import java.util.Arrays;

public class Inventory {
    Object[] inventory;
    Weapons weapons;
    Protections protections;
    HealthPotion healthPotion;
    BigHealthPotion bigHealthPotion;

    public Inventory() {
        inventory = new Object[6];

        inventory[0] = getWeapons();
        inventory[1] = getProtections();
        inventory[2] = getHealthPotion();
        inventory[3] = getHealthPotion();
        inventory[4] = getBigHealthPotion();
        inventory[5] = getBigHealthPotion();

    }

    public Object[] getInventory() {
        return inventory;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public void setProtections(Protections protections) {
        this.protections = protections;
    }

    public void setHealthPotion(HealthPotion healthPotion) {
        this.healthPotion = healthPotion;
    }

    public void setBigHealthPotion(BigHealthPotion bigHealthPotion) {
        this.bigHealthPotion = bigHealthPotion;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public Protections getProtections() {
        return protections;
    }

    public HealthPotion getHealthPotion() {
        return healthPotion;
    }

    public BigHealthPotion getBigHealthPotion() {
        return bigHealthPotion;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventory=" + Arrays.toString(inventory) +
                ", weapons=" + weapons +
                ", protections=" + protections +
                ", healthPotion=" + healthPotion +
                ", bigHealthPotion=" + bigHealthPotion +
                '}';
    }
}
