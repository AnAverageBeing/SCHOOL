package school.GuessGame;

import java.util.Scanner;

public class GameManager {
    private String ilgPos = "Illegal position! Try again.";
    private String alr = "Tile is already broken";
    private Game game;
    public GameManager(Game game) {
        this.game = game;
    }

    public void startGame() {
        Scanner in = new Scanner(System.in);
        String guess;
        int x;
        int y;
        int result;
        while((game.starsFound != game.goldenTiles) && (game.triesLeft > 0)) {
            game.grid.printGrid();
            System.out.print("\n");
            System.out.println("Tries Left: "+game.triesLeft+
            " Stars Found: "+game.starsFound+
            " Total Gusses: "+game.guessesMade);
            System.out.print("Enter a position to hit [x,y]:\n>> ");
            guess = in.next();
            x = getX(guess);
            y = getY(guess);
            result = game.tryToHit(x, y);
            if(result == 1) System.out.println(alr);
            if(result == 2) System.out.println(ilgPos);
        }
        if(game.starsFound == game.goldenTiles) System.out.println("You Won!");
        else System.out.println("Game Over");
    }

    private int getX(String guess) {
        if(guess.split(",").length == 2) {
        String[] str = guess.split(",");
            return Integer.parseInt(str[0]);
        }
        return 0;
    }

    private int getY(String guess) {
        if(guess.split(",").length == 2) {
        String[] str = guess.split(",");
            return Integer.parseInt(str[1]);
        }
        return 0;
    }
}
