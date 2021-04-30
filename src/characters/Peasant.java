package characters;

public abstract class Peasant {

    private String name;
    private String picture;
    private int hp;
    private int attack;

    public Peasant() {

    }

    public Peasant(String name) {
        this.name = name;
    }

    public Peasant(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public String descriptionWarrior() {
        return "Votre personnage s'appelle " + this.name + " c'est un brave et fier guerrier, il a " + this.hp + " points de vie et "
                + this.attack + " d'attaque ";
    }
    public String descriptionWizard() {
        return "Votre personnage s'appelle " + this.name + " c'est une redoutable magicienne, elle a " + this.hp + " points de vie et "
                + this.attack + " d'attaque ";
    }
    public int throwDice() {
        int dice = 0;
        dice = (int) (Math.random() * 6 + 1);
        return dice;
    }
    /*
    public int getPosition() {
        return position.getCell();
    */
}
