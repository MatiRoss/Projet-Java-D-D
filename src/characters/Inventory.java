package characters;

import equipments.BigHealthPotion;
import equipments.HealthPotion;
import equipments.Protections;
import equipments.Weapons;
import game.Cell;

import java.util.Arrays;

/**
 *
 */
public class Inventory {
    Object[] inventory;

    public Inventory() {
        inventory = new Object[6];

        inventory[0] = getWeapons();
        inventory[1] = getProtections();
        inventory[2] = getHealthPotion1();
        inventory[3] = getHealthPotion2();
        inventory[4] = getBigHealthPotion1();
        inventory[5] = getBigHealthPotion2();

    }

    public void setInventory(Object o) {
        if (o instanceof Weapons) {
            if (this.inventory[0] == null) {
                System.out.println("Vous rangez l'objet dans votre sac.");
                this.inventory[0] = o;
            } else {
                System.out.println("Vous ne pouvez avoir qu'une seule arme dans l'inventaire.");
            }
        } else if (o instanceof Protections) {
            if (this.inventory[1] == null) {
                System.out.println("Vous rangez l'objet dans votre sac.");
                this.inventory[1] = o;
            } else {
                System.out.println("Vous ne pouvez avoir qu'un seul bouclier dans l'inventaire.");
            }
        } else if (o instanceof HealthPotion) {
            if (this.inventory[2] == null || this.inventory[3] == null) {
                if (this.inventory[2] == null) {
                    System.out.println("Vous rangez la potion dans votre sac.");
                    this.inventory[2] = o;
                } else {
                    System.out.println("Vous rangez la potion dans votre sac.");
                    this.inventory[3] = o;
                }
            } else {
                System.out.println("Vous ne pouvez pas porter plus de " + ((HealthPotion) o).getName() + "!");
            }
        } else if (o instanceof BigHealthPotion) {
            if (this.inventory[4] == null || this.inventory[5] == null) {
                if (this.inventory[4] == null) {
                    System.out.println("Vous rangez la potion dans votre sac.");
                    this.inventory[4] = o;
                } else {
                    System.out.println("Vous rangez la potion dans votre sac.");
                    this.inventory[5] = o;
                }
            } else {
                System.out.println("Vous ne pouvez pas porter plus de " + ((BigHealthPotion) o).getName() + "!");
            }
        }
    }

    public Weapons getWeapons() {
        return (Weapons) this.inventory[0];
    }

    public Protections getProtections() {
        return (Protections) this.inventory[1];
    }

    public HealthPotion getHealthPotion1() {
        return (HealthPotion) this.inventory[2];
    }

    public HealthPotion getHealthPotion2() {
        return (HealthPotion) this.inventory[3];
    }

    public BigHealthPotion getBigHealthPotion1() {
        return (BigHealthPotion) this.inventory[4];
    }

    public BigHealthPotion getBigHealthPotion2() {
        return (BigHealthPotion) this.inventory[5];
    }


    @Override
    public String toString() {
        return "Inventory{" +
                "inventory=" + Arrays.toString(inventory) +
                ", weapons=" + getWeapons() +
                ", protections=" + getProtections() +
                ", healthPotion=" + getHealthPotion1() +
                ", bigHealthPotion=" + getBigHealthPotion1() +
                '}';
    }
}
