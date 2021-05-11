package equipments;

import characters.Character;
import characters.Warrior;
import characters.Wizard;
import game.Cell;

public class Philter extends Protections {

    public Philter() {
        super("Philtre", 2);
    }

    @Override
    public void interaction(Character player, Cell cell) {
        if (player instanceof Warrior) {
            System.out.println("... Mais vous êtes un guerrier, vous ne savez même pas ce qu'est un philtre!");
            System.out.println(" ---------------------------------------------------");
        } else {
            player.getInventory().setInventory(cell);
        }
    }
}
