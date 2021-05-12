package equipments;

import characters.Character;
import characters.Warrior;
import characters.Wizard;
import game.Cell;

public class Sword extends Weapons {

    public Sword() {
        super("Epée", 5);
    }

    @Override
    public void interaction(Character player, Cell cell) {
        if (player instanceof Wizard) {
            System.out.println("... Mais vous êtes un magicien, les armes c'est pour les barbares!");
            System.out.println(" ---------------------------------------------------");
        } else {
            player.getInventory().setInventory(cell);
        }
    }

}
