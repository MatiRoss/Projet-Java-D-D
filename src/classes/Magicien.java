package classes;

import gameBoard.Board;

public class Magicien {

    private String name;
    private String picture;
    private int hp = 3;
    private int attack = 8;
    private Board position;

    public Magicien() {

        name = "";
    }

    public Magicien(String name) {
        this.name = name;
    }

    public Magicien(String name, String picture, int hp, int attack) {
        this.name = name;
        this.picture = picture;
        this.hp = hp;
        this.attack = attack;
    }

    public void setName() {

        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public String toString() {
        return "Votre personnage s'appelle " + this.name + " c'est un(e) redoutable sorcier(e), il a " + this.hp + " points de vie et "
                + this.attack + " d'attaque ";
    }
    public int getPosition() {
        return position.getCell();
    }
}
