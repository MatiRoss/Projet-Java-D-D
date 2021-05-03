package equipments;

public class HealthPotion {
    String name;
    int health;

    public HealthPotion() {
        this.health = 2;
        this.name = "Health Potion";
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
