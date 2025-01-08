package game.models.rooms;

import game.models.Player;

public class EntryRoom extends Room {
    public EntryRoom() {
        super("Entry Room");
    }

    @Override
    public void enterRoom(Player player) {
        System.out.println("You entered the dungeon's entry room. Good luck on your adventure!");
    }
}
