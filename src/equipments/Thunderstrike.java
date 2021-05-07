package equipments;

import characters.Character;
import characters.Warrior;
import characters.Wizard;
import game.Cell;

public class Thunderstrike extends Weapons {

    public Thunderstrike() {
        super("Sort : Eclair", 2);
    }

    @Override
    public void interaction(Character player, Cell cell) {
        if (player instanceof Warrior) {
            System.out.println("... Mais vous êtes un barbare... Vous ne comprenez rien à la magie!");
            System.out.println(" ---------------------------------------------------");
        } else {
            if (player.getAttack() < player.getAttackMax()) {
                if (!((Wizard) player).hasThunderstrike()) {
                    System.out.println("Vous lisez attentivement le livre de " + getName() + "...");
                    System.out.println("... Vous avez appris le " + getName() + "!");
                    System.out.println(" ---------------------------------------------------");
                    player.setAttack(player.getAttackMin() + getPower());
                    System.out.println("Vos dégats augmentent de " + getPower() + " et passent à " + player.getAttack() + ".");
                    System.out.println(" ---------------------------------------------------");
                    ((Wizard) player).setHasThunderstrike(true);
                } else {
                    System.out.println("... Mais vous possédez déjà le " + getName() + "!");
                    System.out.println(" ---------------------------------------------------");
                }
            } else {
                System.out.println('\n' + "... Mais vous avez déjà atteint votre maximum de puissance d'attaque!");
            }
        }
    }
}
