package equipments;

import characters.Character;
import characters.Wizard;
import game.Cell;
import gameBoard.Board;

public class Shield extends Protections {

    private Board board;

    public Shield() {
        super("Bouclier", 5);
    }

    @Override
    public void interaction(Character player, Cell cell) {

        board = new Board();
        if (player instanceof Wizard) {
            System.out.println("... Mais vous êtes un magicien, vous n'avez pas même pas la force de le soulever!");
            System.out.println(" ---------------------------------------------------");
        } else {
            if (cell instanceof Protections) {
                player.addToInventory(player, cell);
            }
        }
    }
}
