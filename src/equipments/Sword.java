package equipments;

import characters.Character;
import characters.Warrior;
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
                if (!((Warrior) player).hasSword()) {
                    System.out.println('\n' + "Vous vous équipez de l'arme.");
                    System.out.println("Vos dégats augmentent de " + (player.getAttackMax() - player.getAttack()) + " et passent à " + player.getAttackMax() + ".");
                    player.setAttack(player.getAttackMax());
                } else {
                    System.out.println('\n' + "... Mais vous possédez déjà une " + getName() + "!");
                    ((Warrior) player).setHasSword(true);
                }
            } else {
                System.out.println('\n' + "... Mais vous avez déjà atteint votre maximum de puissance d'attaque!");
            }
        }
    }
}
