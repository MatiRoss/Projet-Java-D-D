package equipments;

import characters.Character;
import characters.Wizard;
import enemies.Ennemy;
import game.Cell;
import gameBoard.Board;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Shield extends Protections {

    private Board board;

    public Shield() {
        super("Bouclier", 2);
    }

    @Override
    public void interaction(Character player, Cell cell) {

        board = new Board();
        if (player instanceof Wizard) {
            System.out.println("... Mais vous êtes un magicien, vous n'avez pas même pas la force de le soulever!");
            System.out.println(" ---------------------------------------------------");
        } else {
            if (cell instanceof Ennemy) {
                board.getBoard().forEach((monster) ->  ((Ennemy) cell).setAttack(((Ennemy) cell).getAttack() - getDefense()));
            }
        }
    }
}
