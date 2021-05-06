package equipments;

import characters.Character;
import characters.Warrior;
import characters.Wizard;

public class Fireball extends Weapons {

    public Fireball() {
        super("Sort : Boule de feu", 7);
    }

    @Override
    public void interaction(Character player) {
        if (player instanceof Warrior) {
            System.out.println('\n' + "... Mais vous êtes un barbare... Vous ne comprenez rien à la magie!");
        } else {
            if (player.getAttack() < player.getAttackMax()) {
                if (!((Wizard) player).hasFireBall()) {
                    System.out.println('\n' + "Vous lisez attentivement le livre de " + getName() + "...");
                    System.out.println("... Vous avez appris le " + getName() + "!" + '\n');
                    System.out.println("Vos dégats augmentent de " + (player.getAttackMax() - player.getAttack()) + " et passent à " + player.getAttackMax() + ".");
                    player.setAttack(player.getAttackMax());
                } else {
                    System.out.println('\n' + "... Mais vous possédez déjà le " + getName() + "!");
                    ((Wizard) player).setHasFireBall(true);
                }
            } else {
                System.out.println("... Mais vous avez déjà atteint votre maximum de puissance d'attaque!");
            }
        }
    }
}
