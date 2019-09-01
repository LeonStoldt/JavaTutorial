package game.creature.character;

import game.item.Item;

import java.util.HashMap;
import java.util.Map;

public class Backpack {

    private final String designation;

    private final int maxItemsSlots;

    private Map<Item, Integer> items;

    private static final int MAX_STACK_SIZE = 64;

    public Backpack(String designation, int maxItemSlots) {
        this.designation = designation;
        this.maxItemsSlots = maxItemSlots;
        this.items = new HashMap<>();
    }

    public String getDesignation() {
        return designation;
    }

    public Map<Item, Integer> getItems() {
        return items;
    }

    public void addItem(Item item, int count) {
        if (!isFull() && count <= MAX_STACK_SIZE) {
            items.put(item, count);
        }
    }

    public boolean isFull() {
        return items.size() == maxItemsSlots;
    }

    @Override
    public String toString() {
        return "'" + designation + "' - maxItemsSlots=" + maxItemsSlots + ", items=" + items;
    }
}
