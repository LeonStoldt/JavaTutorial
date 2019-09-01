package game.creature;

import java.util.List;

public interface Creature {

    String getName();

    int getAge();

    int getHealth();

    boolean isAggressive();

    List<Characteristic> getCharacteristics();

    Species getSpecies();
}
