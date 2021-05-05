package equipments;

import characters.Character;

public class Club extends Weapons {

    public Club() {
        super("Massue", 3);
    }

    @Override
    public void interaction(Character player) {
        System.out.println("Vous vous équipez de la " + getName() + '\n');
        player.setAttack(player.getAttack() + getPower());
        System.out.println("Vos dégats augmentent de " + getPower() + " et passent à " + player.getAttack() + ".");
    }
}
