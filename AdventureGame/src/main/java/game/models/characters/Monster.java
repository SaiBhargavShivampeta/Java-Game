package game.models.characters;

public class Monster implements Character {
    @Override
    public void performAction() {
        System.out.println("The monster attacks!");
    }
}
