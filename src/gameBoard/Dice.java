package gameBoard;

public class Dice {
    private int dice;

    public Dice(int dice) {
        this.dice = (int) (Math.random() * 6 + 1);
    }

    public int getDice() {
        return dice;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }
}
