package game.controller;

import game.factory.RoomFactory;
import game.models.Player;
import game.models.rooms.Room;

public class GameController {
    private static GameController instance;
    private Player player;

    private GameController() {
        player = new Player();
    }

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    public void startGame() {
        System.out.println("Welcome to the Adventure Game!");

        while (player.getHealth() > 0) {
            Room room = RoomFactory.createRoom(getRandomRoomType());
            room.enterRoom(player);

            if (player.getHealth() <= 0) {
                System.out.println("Game Over!");
                break;
            }

            player.showInventory();
            System.out.println("Do you want to continue to the next room? (1) Yes (2) No");
            int choice = getPlayerChoice(2, player); // Pass player to get player scanner
            if (choice == 2) {
                System.out.println("You decided to leave the dungeon. Thanks for playing!");
                break;
            }
        }
    }

    private String getRandomRoomType() {
        String[] roomTypes = {"treasure", "monster", "empty"};
        return roomTypes[(int) (Math.random() * roomTypes.length)];
    }

    // Modified to use Player's Scanner
    private int getPlayerChoice(int maxChoice, Player player) {
        int choice;
        do {
            System.out.print("Enter your choice (1-" + maxChoice + "): ");
            choice = player.getScanner().nextInt();  // Use the Player's scanner
        } while (choice < 1 || choice > maxChoice);
        return choice;
    }
}
