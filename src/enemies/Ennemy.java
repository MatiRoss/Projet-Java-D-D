package enemies;

import game.Cell;

public abstract class Ennemy extends Cell {

    private String name;
    private String picture;
    private int hp;
    private int attack;

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
}
