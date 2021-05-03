package equipments;

public abstract class Protections {
    String name;
    int defense;

    public Protections() {
    }

    public Protections(String name) {
        this.name = name;
    }

    public Protections(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Protections{" +
                "name='" + name + '\'' +
                ", defense=" + defense +
                '}';
    }
}
