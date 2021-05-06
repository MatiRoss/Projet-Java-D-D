package characters;

public class Warrior extends Character {

        private boolean hasClub;
        private boolean hasSword;

    public Warrior() {
    }

    public Warrior(String name) {
        super(name, 5, 5, 10, 5, 5, 10);
        this.hasClub = false;
        this.hasSword = false;
    }

    public void setHasClub(boolean hasClub) {
        this.hasClub = hasClub;
    }

    public void setHasSword(boolean hasSword) {
        this.hasSword = hasSword;
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
