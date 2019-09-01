package game.creature.character;

import game.creature.Characteristic;
import game.creature.Species;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

public class Knight implements Character {

    private static final int MAX_HEALTH = 100;
    private static final Logger LOGGER = LoggerFactory.getLogger(Character.class);

    private final String name;
    private final int age;
    private final List<Characteristic> characteristics;
    private Backpack backpack;
    private int health;
    private boolean isAggressive;

    public Knight(String name, int age, List<Characteristic> characteristics, Backpack backpack) {
        this.name = name;
        this.age = age;
        this.characteristics = characteristics;
        this.backpack = backpack;
        this.health = MAX_HEALTH;
        this.isAggressive = false;
    }

    @Override
    public Backpack getBackpack() {
        return this.backpack;
    }

    @Override
    public void speak(String text) {
        LOGGER.info(text);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public boolean isAggressive() {
        return this.isAggressive;
    }

    @Override
    public List<Characteristic> getCharacteristics() {
        return this.characteristics;
    }

    @Override
    public Species getSpecies() {
        return Species.KNIGHT;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", characteristics=" + characteristics.stream().map(Characteristic::getValue).collect(Collectors.joining(", ")) +
                ", backpack=" + backpack +
                ", health=" + health +
                ", isAggressive=" + isAggressive +
                '}';
    }
}
