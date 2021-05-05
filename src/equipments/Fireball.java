package equipments;

import characters.Character;
import characters.Warrior;

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
                System.out.println('\n' + "Vous lisez attentivement le livre de " + getName() + "...");
                System.out.println("... Vous avez appris le " + getName() + "!" + '\n');
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
