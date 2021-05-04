package equipments;

import characters.Character;
import game.Cell;

public class BigHealthPotion extends Cell {
    String name;
    int health;

    public BigHealthPotion() {
        this.health = 5;
        this.name = "Grande potion de soin";
    }

    @Override
    public void interaction(Character player) {

    }

    public int getPower() {
        return health;
    }

    public void setPower(int power) {
        this.health = power;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vous tombez sur un coffre. Vous l'ouvrez..." + '\n' + "Wow quelle chance! Vous avez trouvé une " + name + " ! Elle rend " + health + " points de vie.";
    }
}
