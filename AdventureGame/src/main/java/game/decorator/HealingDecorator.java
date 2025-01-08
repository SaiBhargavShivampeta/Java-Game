package game.decorator;

import game.models.characters.Character;

public class HealingDecorator extends CharacterDecorator {

    public HealingDecorator(Character character) {
        super(character);
    }

    @Override
    public void performAction() {
        super.performAction();  // Call the original action first
        System.out.println("The character heals themselves by 20 points!");
    }
}
