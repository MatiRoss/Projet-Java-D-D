package equipments;

import characters.Character;

public class Sword extends Weapons {

    public Sword() {
        super("Epée", 5);
    }

    @Override
    public void interaction(Character player) {
        while (player.getAttack() < 10) {
            System.out.println("Vous vous équipez de la " + getName() + "." + '\n');
            player.setAttack(player.getAttack() + getPower());
            System.out.println("Vos dégats augmentent de " + getPower() + " et passent à " + player.getAttack() + ".");
        }
    }
}
