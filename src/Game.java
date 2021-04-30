import menu.Menu;

public class Game {

    public Game() {
    }

  /*  public static void playGame() {
        Scanner clavier = new Scanner(System.in);

        Board board = new Board();

        while (board.getCell() < 64) {
            System.out.println("Voulez-vous lancer le dé? Taper 'oui' ou 'non' ");
            String lanceDe = clavier.nextLine();
            if (lanceDe.equals("oui")) {
                int diceValue = board.throwDice();
                board.setCell(board.getCell() + diceValue);
                System.out.println("Vous lancez le dé et faites un " + diceValue);
                System.out.println("Vous avancez à la case " + board.getCell());
            } else {
                System.out.println("Navré de vous voir déjà partir, peut être n'étiez-vous pas de taille...");
                System.exit(0);
            }

        }
        System.exit(0);
    }
*/

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.createCharacter();
        menu.playGame();


    }
}
