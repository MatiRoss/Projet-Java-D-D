package characters;

public class Warrior extends Character {

    private boolean hasClub;
    private boolean hasSword;
    private boolean hasBow;

    public Warrior() {
    }

    public Warrior(String name) {
        super(name, 5, 5, 10, 5, 5, 10, new Inventory());
        this.hasClub = false;
        this.hasSword = false;
        this.hasBow = false;
    }

    public void setHasBow(boolean hasBow) {
        this.hasBow = hasBow;
    }

    public void setHasClub(boolean hasClub) {
        this.hasClub = hasClub;
    }

    public void setHasSword(boolean hasSword) {
        this.hasSword = hasSword;
    }

    public boolean hasBow() {
        return hasBow;
    }

    public boolean hasClub() {
        return hasClub;
    }

    public boolean hasSword() {
        return hasSword;
    }

    public String toString() {
        return super.toString();
    }
}
