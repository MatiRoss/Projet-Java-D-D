package characters;

import equipments.BigHealthPotion;
import equipments.HealthPotion;
import equipments.Protections;
import equipments.Weapons;
import game.Cell;

import java.util.Scanner;

public abstract class Character {

    private String name;
    private String picture;
    private int hp;
    private int hpMin;
    private int hpMax;
    private int attack;
    private int attackMin;
    private int attackMax;
    private Object[] inventory;

    public Character() {

    }

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, int hp, int hpMin, int hpMax, int attack, int attackMin, int attackMax, Inventory inventory) {
        this.name = name;
        this.hp = hp;
        this.hpMin = hpMin;
        this.hpMax = hpMax;
        this.attack = attack;
        this.attackMin = attackMin;
        this.attackMax = attackMax;
        this.inventory = inventory.getInventory();

    }

    public void addToInventory(Character player, Cell cell) {

        if (cell instanceof Weapons) {
            if (player.getInventory()[0] == null) {
                player.getInventory()[0] = cell;
            } else {
                System.out.println("Vous ne pouvez avoir qu'un seule arme dans l'inventaire.");
            }
        }

        if (cell instanceof Protections) {
            if (player.getInventory()[1] == null) {
                player.getInventory()[1] = cell;
            } else {
                System.out.println("Vous ne pouvez avoir qu'un seul bouclier dans l'inventaire.");
            }

        }

        if (cell instanceof HealthPotion) {
            if (player.getInventory()[2] == null || player.getInventory()[3] == null) {
                if (player.getInventory()[2] == null) {
                    player.getInventory()[2] = cell;
                } else if (player.getInventory()[3] == null) {
                    player.getInventory()[3] = cell;
                }
            } else {
                System.out.println("Vous ne pouvez pas porter plus de " + ((HealthPotion) cell).getName() + "!");
            }

        }
        if (cell instanceof BigHealthPotion) {
            if (player.getInventory()[4] == null || player.getInventory()[5] == null) {
                if (player.getInventory()[4] == null) {
                    player.getInventory()[4] = cell;
                } else if (player.getInventory()[5] == null) {
                    player.getInventory()[5] = cell;
                }
            } else {
                System.out.println("Vous ne pouvez pas porter plus de " + ((BigHealthPotion) cell).getName() + "!");
            }
        }
    }

    public void displayInventory(Character player) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Vous fouillez dans votre sac..." + '\n');
        for (int i = 0; i < player.getInventory().length; i++) {
            if (player.getInventory()[i] == null) {
                System.out.println("[" + i + "] (Utiliser)" + "            <Vide>");
            } else {
                System.out.println("[" + i + "] (Utiliser)" + "            " + player.getInventory()[i]);
            }
        }
    }

    public void setInventory(Object[] inventory) {
        this.inventory = inventory;
    }

    public Object[] getInventory() {
        return inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getHpMax() {
        return hpMax;
    }

    public int getAttackMax() {
        return attackMax;
    }

    public int getHpMin() {
        return hpMin;
    }

    public int getAttackMin() {
        return attackMin;
    }

    public String getName() {
        return name;
    }

    public String descriptionWarrior() {
        return "Votre personnage s'appelle " + this.name + ", c'est un(e) brave et fier(e) guerrier(e), il/elle a " + this.hp + " points de vie et "
                + this.attack + " d'attaque. ";
    }

    public String descriptionWizard() {
        return "Votre personnage s'appelle " + this.name + ", c'est un(e) redoutable magicien(ne), il/elle a " + this.hp + " points de vie et "
                + this.attack + " d'attaque. ";
    }

    public int throwDice() {
        int dice = 0;
        dice = (int) (Math.random() * 6 + 1);
        return dice;
    }

    public String showStats() {
        return getName() + " ==>  PV : " + getHp() + " ATK : " + getAttack() + " DEF : ";
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                '}';
    }
}
