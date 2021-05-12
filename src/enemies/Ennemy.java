package enemies;

import characters.Character;
import characters.Warrior;
import game.*;
import menu.MenuText;

public class Ennemy extends Cell {

    private String name;
    private String picture;
    private int hp;
    private int attack;
    private boolean isDead;

    public Ennemy() {
    }

    public Ennemy(String name) {
        this.name = name;
    }

    public Ennemy(String name, int hp, int attack, boolean isDead) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.isDead = isDead;
    }

    @Override
    public void interaction(Character player, Cell cell) {
        while (getHp() > 0 && player.getHp() > 0) {
            setDead(false);
            MenuText text = new MenuText();
            System.out.println("_______________________________________________________");
            System.out.println("Vous attaquez le " + getName() + " et lui infligez " + player.getAttack() + " points de dégats");
            setHp(getHp() - player.getAttack());
            if (getHp() > 0) {
                System.out.println("L'ennemi a encore " + getHp() + " points de vie.");
                System.out.println("----------------------------------------------------");
                if (player instanceof Warrior) {

                }
                System.out.println("Le " + getName() + " vous attaque et vous inflige " + getAttack() + " points de dégats");
                player.setHp(player.getHp() - getAttack());
                if (player.getHp() <= 0) {
                    System.out.println('\n' + "Le " + getName() + " vous porte un coup fatal...");
                    System.out.println("...vous mourrez dans d'atroces souffrances.");
                    text.youLose();
                } else {
                    System.out.println("Il vous reste " + player.getHp() + " points de vie.");
                }
            } else if (getHp() <= 0) {
                setDead(true);
                System.out.println("Vous avez vaincu le " + getName() + "!");
                System.out.println("----------------------------------------------------");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public String showStats() {
        return getName() + " ==>  PV : " + getHp() + " || ATK : " + getAttack();
    }

    @Override
    public String toString() {
        return "Vous tombez sur un " + name + ", il a " + hp + " points de vie et " + attack + " d'attaque.";
    }

    @Override
    public String eventDescription() {
        return "Vous tombez sur un " + name + ", il a " + hp + " points de vie et " + attack + " d'attaque.";
    }
}
