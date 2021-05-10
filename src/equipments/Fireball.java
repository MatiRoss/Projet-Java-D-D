package equipments;

import characters.Character;
import characters.Warrior;
import characters.Wizard;
import game.Cell;

public class Fireball extends Weapons {

    public Fireball() {
        super("Sort : Boule de feu", 7);
    }

    @Override
    public void interaction(Character player, Cell cell) {
        if (player instanceof Warrior) {
            System.out.println("... Mais vous êtes un barbare... Vous ne comprenez rien à la magie!");
            System.out.println(" ---------------------------------------------------");
        } else {
            player.addToInventory(player, cell);
            if (player.getAttack() < player.getAttackMax()) {
                if (!((Wizard) player).hasFireBall()) {
                    System.out.println("Vous lisez attentivement le livre de " + getName() + "...");
                    System.out.println("... Vous avez appris le " + getName() + "!");
                    System.out.println(" ---------------------------------------------------");
                    System.out.println("Vos dégats augmentent de " + (player.getAttackMax() - player.getAttack()) + " et passent à " + player.getAttackMax() + ".");
                    System.out.println(" ---------------------------------------------------");
                    player.setAttack(player.getAttackMax());
                } else {
                    System.out.println("... Mais vous possédez déjà le " + getName() + "!");
                    System.out.println(" ---------------------------------------------------");
                    ((Wizard) player).setHasFireBall(true);
                }
            } else {
                System.out.println("... Mais vous avez déjà atteint votre maximum de puissance d'attaque!");
            }
        }
    }
}
