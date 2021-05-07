package enemies;

public class Rat extends Ennemy {

    public Rat() {
        super("Rat", 1, 1, false);
    }

    @Override
    public String toString() {
        return "Vous retombez sur le cadavre de l'ennemi que vous avez tué. Il est cerné par les rats." + '\n' + "Attention, il y en a qui vous attaque!";
    }
}
