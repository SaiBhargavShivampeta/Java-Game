package game.factory;

import game.models.characters.*;

public class CharacterFactory {
    public static game.models.characters.Character createCharacter(String type) {
        // Use a switch-case statement to create and return the appropriate character type
        switch (type.toLowerCase()) {
            case "player":
                return new Player(); // Player class from game.models.characters
            case "monster":
                return new Monster(); // Monster class from game.models.characters
            case "npc":
                return new NPC(); // NPC class from game.models.characters
            default:
                throw new IllegalArgumentException("Unknown character type!"); // If an invalid type is passed
        }
    }
}
