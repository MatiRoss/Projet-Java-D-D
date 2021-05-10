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
    public void interaction(Character player, Cell cell) {
        player.addToInventory(player, cell);
        if (player.getHp() < player.getHpMax()) {
            System.out.println("Vous buvez la potion... Glouglou... hips!");
            if (player.getHp() >= player.getHpMin()) {
                System.out.println("Vos points de vie augmentent de " + (player.getHpMax() - player.getHp()) + "!");
                System.out.println("----------------------------------------------------");
                player.setHp(player.getHpMax());
            } else {
                System.out.println("Vos points de vie augmentent de " + getHealth() + "!");
                System.out.println("----------------------------------------------------");
                player.setHp(player.getHp() + getHealth());
            }
            System.out.println("Vous avez désormais " + player.getHp() + " points de vie.");
            System.out.println("----------------------------------------------------");
        } else {
            System.out.println("... Mais vous avez déjà atteint votre maximum de points de vie!");
            System.out.println(" ---------------------------------------------------");
        }
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
