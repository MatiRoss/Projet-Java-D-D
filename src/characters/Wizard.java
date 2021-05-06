package characters;

public class Wizard extends Character {

    private boolean hasThunderstrike;
    private boolean hasFireBall;

    public Wizard(String name) {
        super(name, 3, 3, 6, 8, 8, 15);
        this.hasThunderstrike = false;
        this.hasFireBall = false;
    }

    public void setHasThunderstrike(boolean hasThunderstrike) {
        this.hasThunderstrike = hasThunderstrike;
    }

    public void setHasFireBall(boolean hasFireBall) {
        this.hasFireBall = hasFireBall;
    }

    public boolean hasThunderstrike() {
        return hasThunderstrike;
    }

    public boolean hasFireBall() {
        return hasFireBall;
    }

    public String toString() {
        return super.toString();
    }
}
