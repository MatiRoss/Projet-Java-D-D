package equipments;

import characters.Character;
import characters.Wizard;

public class Sword extends Weapons {

    public Sword() {
        super("Epée", 5);
    }

    @Override
    public void interaction(Character player) {
        if (player instanceof Wizard) {
            System.out.println('\n' + "... Mais vous êtes un magicien, les armes c'est pour les barbares!");
        } else {
            if (player.getAttack() < player.getAttackMax()) {
                System.out.println("Vous vous équipez de la " + getName() + "." + '\n');
                player.setAttack(player.getAttack());
                player.setAttack(player.getAttack() + getPower());
                if (player.getAttack() > player.getAttackMax()) {
                    player.setAttack(player.getAttackMax());
                }
                System.out.println("Vos dégats augmentent de " + getPower() + " et passent à " + player.getAttack() + ".");

            } else {
                System.out.println("... Mais vous avez déjà atteint votre maximum de puissance d'attaque!");
            }
        }
    }
}
