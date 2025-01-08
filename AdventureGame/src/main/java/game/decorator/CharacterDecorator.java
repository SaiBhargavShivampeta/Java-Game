package game.decorator;

import game.models.characters.Character;

public abstract class CharacterDecorator implements Character {
    protected Character decoratedCharacter;

    public CharacterDecorator(Character character) {
        this.decoratedCharacter = character;
    }

    @Override
    public void performAction() {
        decoratedCharacter.performAction();
    }
}
