package game.models.rooms;

import game.models.Player;

public class EmptyRoom extends Room {
    public EmptyRoom() {
        super("Empty Room");
    }

    @Override
    public void enterRoom(Player player) {
        System.out.println("You entered an empty room. Nothing happens.");
    }
}
