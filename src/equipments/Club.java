package equipments;

import characters.Character;
import characters.Warrior;
import characters.Wizard;
import game.Cell;

public class Club extends Weapons {

    public Club() {
        super("Massue", 3);
    }

    @Override
    public void interaction(Character player, Cell cell) {
        if (player instanceof Wizard) {
            System.out.println("... Mais vous êtes un magicien, les armes c'est pour les barbares!");
            System.out.println(" ---------------------------------------------------");
        } else {
            if (player.getAttack() < player.getAttackMax()) {
                if (!((Warrior) player).hasClub()) {
                    System.out.println("Vous vous équipez de l'arme.");
                    player.setAttack(player.getAttackMin() + getPower());
                    System.out.println("Vos dégats augmentent de " + getPower() + " et passent à " + player.getAttack() + ".");
                    System.out.println(" ---------------------------------------------------");
                    ((Warrior) player).setHasClub(true);
                } else {
                    System.out.println("... Mais vous possédez déjà une " + getName() + "!");
                    System.out.println(" ---------------------------------------------------");
                }
            } else {
                System.out.println("... Mais vous avez déjà atteint votre maximum de puissance d'attaque!");
                System.out.println(" ---------------------------------------------------");
            }
        }
    }
}
