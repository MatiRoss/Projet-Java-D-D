package equipments;

import characters.Character;
import characters.Warrior;
import characters.Wizard;

public class Club extends Weapons {

    public Club() {
        super("Massue", 3);
    }

    @Override
    public void interaction(Character player) {
        if (player instanceof Wizard) {
            System.out.println('\n' + "... Mais vous êtes un magicien, les armes c'est pour les barbares!");
        } else {
            if (player.getAttack() < player.getAttackMax()) {
                if (!((Warrior) player).hasClub()) {
                    System.out.println('\n' + "Vous vous équipez de la " + getName() + ".");
                    player.setAttack(player.getAttackMin() + getPower());
                    System.out.println("Vos dégats augmentent de " + getPower() + " et passent à " + player.getAttack() + ".");
                    ((Warrior) player).setHasClub(true);
                } else {
                    System.out.println('\n' + "... Mais vous possédez déjà une " + getName() + "!");
                }
            } else {
                System.out.println('\n' + "... Mais vous avez déjà atteint votre maximum de puissance d'attaque!");
            }
        }
    }
}
