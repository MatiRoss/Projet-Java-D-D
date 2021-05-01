import menu.Menu;
import game.Game;

public class App {

    public App() {
    }

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.createCharacter();
        menu.playGame();


    }
}
