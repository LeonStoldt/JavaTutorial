package game.creature.animal;

import game.creature.Creature;

public interface Animal extends Creature {

    int getLifeExpectancy();

    String getColor();
}
