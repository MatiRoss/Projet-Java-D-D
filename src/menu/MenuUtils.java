package menu;

import java.util.Scanner;

public class MenuUtils {
    Scanner clavier = new Scanner(System.in);

    public int getPlayerCharacter() {
        return clavier.nextInt();
    }

}



