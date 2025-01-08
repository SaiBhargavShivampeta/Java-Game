package game.decorator;

import game.models.characters.Character;

public class ShieldDecorator extends CharacterDecorator {

    public ShieldDecorator(Character character) {
        super(character);
    }

    @Override
    public void performAction() {
        super.performAction();  // Call the original action first
        System.out.println("The character blocks the attack with a shield!");
    }
}
