package equipments;

import characters.Character;
import game.Cell;

import java.util.Arrays;

public class HealthPotion extends Cell {
    String name;
    int health;

    public HealthPotion() {
        this.health = 2;
        this.name = "Petite potion de soin";
    }

    @Override
    public void interaction(Character player, Cell cell) {
        player.getInventory().setInventory(cell);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int power) {
        this.health = power;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "(+" + health + " PV)" + '\n';
    }

    public String eventDescription() {
        return "Vous tombez sur un coffre. Vous l'ouvrez..." + '\n' + "Wow quelle chance! Vous avez trouvé une " + name + "! Elle rend " + health + " points de vie.";
    }
}
