package equipments;

import game.Cell;

public abstract class Weapons extends Cell {
    private String name;
    private int power;

    public Weapons() {

    }

    public Weapons(String name) {
        this.name = name;
    }

    public Weapons(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return name + "(+" + power + " ATK)" + '\n';
    }

    public String eventDescription() {
        return "Vous tombez sur un coffre. Vous l'ouvrez..." + '\n' + "Wow quelle chance, vous avez trouvé un(e) " + name + "! (+" + power + " d'attaque)";
    }
}
