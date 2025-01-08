package game.decorator;

import game.models.characters.Character;

public class MagicDecorator extends CharacterDecorator {

    public MagicDecorator(Character character) {
        super(character);
    }

    @Override
    public void performAction() {
        super.performAction();  // Call the original action first
        System.out.println("The character casts a magic spell!");
    }
}
