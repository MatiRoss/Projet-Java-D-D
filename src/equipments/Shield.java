package equipments;

import characters.Character;
import characters.Wizard;
import game.Cell;

public class Shield extends Protections {

    public Shield() {
        super("Bouclier", 5);
    }

    @Override
    public void interaction(Character player, Cell cell) {
        if (player instanceof Wizard) {
            System.out.println("... Mais vous êtes un magicien, vous n'avez pas même pas la force de le soulever!");
            System.out.println(" ---------------------------------------------------");
        } else {
            player.getInventory().setInventory(cell);
        }
    }
}
