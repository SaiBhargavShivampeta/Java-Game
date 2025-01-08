package game.decorator;

import game.models.characters.Character;

public class WeaponDecorator extends CharacterDecorator {

    public WeaponDecorator(Character character) {
        super(character);
    }

    @Override
    public void performAction() {
        super.performAction();  // Call the original action first
        System.out.println("The character attacks with a sword!");
    }
}
