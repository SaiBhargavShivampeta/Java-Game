package game.models.rooms;

import game.models.Player;

public class TreasureRoom extends Room {
    public TreasureRoom() {
        super("Treasure Room");
    }

    @Override
    public void enterRoom(Player player) {
        System.out.println("You found a treasure room!");
        player.addItem("Gold Coins");
        player.increaseStrength(5);
    }
}
