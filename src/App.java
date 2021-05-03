import menu.Menu;
import game.Game;

public class App {

    public App() {
    }

    public static void main(String[] args) throws Exception {

        Menu menu = new Menu();
        menu.createCharacter();

        Game game = new Game(menu);
        game.gameMenu();
        game.playGame();


    }
}
