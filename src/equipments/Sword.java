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
            if (player.getAttack() < player.getAttackMax()) {
                if (!((Warrior) player).hasSword()) {
                    System.out.println("Vous vous équipez de l'arme.");
                    System.out.println("Vos dégats augmentent de " + (player.getAttackMax() - player.getAttack()) + " et passent à " + player.getAttackMax() + ".");
                    System.out.println(" ---------------------------------------------------");
                    player.setAttack(player.getAttackMax());
                } else {
                    System.out.println("... Mais vous possédez déjà une " + getName() + "!");
                    System.out.println(" ---------------------------------------------------");
                    ((Warrior) player).setHasSword(true);
                }
            } else {
                System.out.println("... Mais vous avez déjà atteint votre maximum de puissance d'attaque!");
                System.out.println(" ---------------------------------------------------");
            }
        }
    }
}
