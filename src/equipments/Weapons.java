package equipments;

public abstract class Weapons {
    private String name;
    private int power;

    public Weapons() {

    }

    public Weapons(String name) {
        this.name = name;
    }

    public Weapons(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Weapons{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}
