package game.models.rooms;

import game.models.Player;

public abstract class Room {
    private String roomName;

    public Room(String name) {
        this.roomName = name;
    }

    public String getRoomName() {
        return roomName;
    }

    public abstract void enterRoom(Player player);

    // Update to use the Player's Scanner
    protected int getPlayerChoice(int maxChoice, Player player) {
        int choice;
        do {
            System.out.print("Enter your choice (1-" + maxChoice + "): ");
            choice = player.getScanner().nextInt();  // Use the Player's scanner
        } while (choice < 1 || choice > maxChoice);
        return choice;
    }
}
