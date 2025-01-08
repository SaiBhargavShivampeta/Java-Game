package game.models.characters;

public class NPC implements Character {
    @Override
    public void performAction() {
        System.out.println("The NPC gives you advice.");
    }
}
