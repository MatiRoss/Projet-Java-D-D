package characters;

import equipments.BigHealthPotion;
import equipments.HealthPotion;
import equipments.Protections;
import equipments.Weapons;

import java.util.Arrays;

/**
 * Class that represents the player's inventory.
 * It has 5 attributes :
 * - 'inventory' : the actual player's inventory (array of objects)
 * - 'weapons' : object of type Weapons that can be stored in inventory
 * - 'protections' : object of type Protections that can be stored in inventory
 * - 'healthPotion' : object representing a potion that can be stored in inventory
 * - 'bigHealthPotion' : object representing a bigger potion that can be stored in inventory
 *
 * @see Weapons
 * @see Protections
 * @see HealthPotion
 * @see BigHealthPotion
 */
public class Inventory {
    Object[] inventory;
    Weapons weapons;
    Protections protections;
    HealthPotion healthPotion;
    BigHealthPotion bigHealthPotion;

    /**
     * Inventory Constructor.
     * Instantiation of the inventory with length set to 6.
     * 1st slot can only store Weapons, 2nd slot can only store Protections, etc...
     */
    public Inventory() {
        inventory = new Object[5];

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
