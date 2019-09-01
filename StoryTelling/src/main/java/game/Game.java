package game;

import game.creature.Characteristic;
import game.creature.character.Backpack;
import game.creature.character.Knight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {

    private static final Logger LOGGER = LoggerFactory.getLogger(Game.class);

    public void startGame() {
        List<Characteristic> characteristicList = new ArrayList<>(Collections.singletonList(Characteristic.SMART));
        Backpack backpack = new Backpack("small backpack", 30);
        Knight braveheart = new Knight("Braveheart", 26, characteristicList, backpack);
        LOGGER.info(braveheart.toString());
    }

    public void test() {
        LOGGER.info("test message - successful");
    }

}
