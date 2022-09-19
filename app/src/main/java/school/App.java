package school;

import java.util.Scanner;

import school.GuessGame.Game;
import school.GuessGame.GameManager;
import school.GuessGame.Grid;

public class App {

    public static void main(String[] args) {
        GameManager manager = new GameManager(new Game(new Grid(8), 4 , 8));
        manager.startGame();
    }
}
