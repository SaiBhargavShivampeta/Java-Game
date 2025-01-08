package game.models.characters;

public class Player implements Character {
    @Override
    public void performAction() {
        System.out.println("The player is exploring the room.");
    }
}
