package game.creature.character;

import game.creature.Creature;

public interface Character extends Creature {

    Backpack getBackpack();

    void speak(String text);

}
