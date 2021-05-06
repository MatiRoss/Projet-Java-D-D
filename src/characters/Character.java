package characters;

public abstract class Character {

    private String name;
    private String picture;
    private int hp;
    private int hpMin;
    private int hpMax;
    private int attack;
    private int attackMin;
    private int attackMax;

    public Character() {

    }

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, int hp, int hpMin, int hpMax, int attack, int attackMin, int attackMax) {
        this.name = name;
        this.hp = hp;
        this.hpMin = hpMin;
        this.hpMax = hpMax;
        this.attack = attack;
        this.attackMin = attackMin;
        this.attackMax = attackMax;
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

    public int getHpMax() {
        return hpMax;
    }

    public int getAttackMax() {
        return attackMax;
    }

    public int getHpMin() {
        return hpMin;
    }

    public int getAttackMin() {
        return attackMin;
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

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                '}';
    }
}
