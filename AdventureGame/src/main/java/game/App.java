package game;

import game.controller.GameController;

public class App {
    public static void main(String[] args) {
        GameController game = GameController.getInstance();
        game.startGame();
    }
}
