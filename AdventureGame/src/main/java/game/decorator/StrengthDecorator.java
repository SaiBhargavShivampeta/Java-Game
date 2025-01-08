package game.decorator;

import game.models.characters.Character;

public class StrengthDecorator extends CharacterDecorator {
    public StrengthDecorator(Character character) {
        super(character);
    }

    @Override
    public void performAction() {
        super.performAction();
        System.out.println("This character has enhanced strength!");
    }
}
