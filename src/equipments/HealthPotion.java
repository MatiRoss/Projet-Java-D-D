package equipments;

import characters.Character;
import game.Cell;

public class HealthPotion extends Cell {
    String name;
    int health;

    public HealthPotion() {
        this.health = 2;
        this.name = "Petite potion de soin";
    }

    @Override
    public void interaction(Character player) {
        System.out.println("Vous buvez la potion... Glouglou... hips!" + '\n');
        System.out.println("Vos points de vie augmentent de " + getHealth() + "!");
        player.setHp(player.getHp() + getHealth());
        System.out.println("Vous avez désormais " + player.getHp() + " points de vie.");
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
        return "Vous tombez sur un coffre. Vous l'ouvrez..." + '\n' + "Wow quelle chance! Vous avez trouvé une " + name + " ! Elle rend " + health + " points de vie.";
    }
}
