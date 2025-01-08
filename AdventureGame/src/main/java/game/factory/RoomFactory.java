package game.factory;

import game.models.rooms.*;

public class RoomFactory {
    public static Room createRoom(String roomType) {
        switch (roomType.toLowerCase()) {
            case "treasure":
                return new TreasureRoom();
            case "monster":
                return new MonsterRoom();
            case "empty":
                return new EmptyRoom();
            default:
                throw new IllegalArgumentException("Unknown room type: " + roomType);
        }
    }
}
