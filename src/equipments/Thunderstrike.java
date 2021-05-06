package equipments;

import characters.Character;
import characters.Warrior;
import characters.Wizard;

public class Thunderstrike extends Weapons {

    public Thunderstrike() {
        super("Sort : Eclair", 2);
    }

    @Override
    public void interaction(Character player) {
        if (player instanceof Warrior) {
            System.out.println('\n' + "... Mais vous êtes un magicien, les armes c'est pour les barbares!");
        } else {
            if (player.getAttack() < player.getAttackMax()) {
                if (!((Wizard) player).hasThunderstrike()) {
                    System.out.println('\n' + "Vous lisez attentivement le livre de " + getName() + "...");
                    System.out.println("... Vous avez appris le " + getName() + "!" + '\n');
                    player.setAttack(player.getAttackMin() + getPower());
                    System.out.println("Vos dégats augmentent de " + getPower() + " et passent à " + player.getAttack() + ".");
                    ((Wizard) player).setHasThunderstrike(true);
                } else {
                    System.out.println('\n' + "... Mais vous possédez déjà le " + getName() + "!");
                }
            } else {
                System.out.println('\n' + "... Mais vous avez déjà atteint votre maximum de puissance d'attaque!");
            }
        }
    }
}
