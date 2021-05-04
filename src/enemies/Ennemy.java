package enemies;

import characters.Character;
import game.*;
import menu.*;

public class Ennemy extends Cell {

    private String name;
    private String picture;
    private int hp;
    private int attack;
    private Menu menu;

    public Ennemy() {
    }

    public Ennemy(String name) {
        this.name = name;
    }

    public Ennemy(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public void interaction(Character player) {
        System.out.println('\n' + "Vous attaquez le " + getName() + " et lui infligez " + player.getAttack() + " points de dégats" + '\n');
        setHp(getHp() - player.getAttack());
        System.out.println("L'ennemi a encore " + getHp() + " points de vie.");
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

    @Override
    public String toString() {
        return "Vous tombez sur un " + name + " il a " + hp + " points de vie et " + attack + " d'attaque";
    }
}
