package equipments;

public class BigHealthPotion {
    String name;
    int health;

    public BigHealthPotion() {
        this.health = 5;
        this.name = "Big Health Potion";
    }

    public int getPower() {
        return health;
    }

    public void setPower(int power) {
        this.health = power;
    }

    public String getName() {
        return name;
    }
}
