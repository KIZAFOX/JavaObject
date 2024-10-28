import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inventory {

    private final List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(final Item item) {
        this.items.add(item);
    }

    public void addItem(final Item... items) {
        this.items.addAll(Arrays.asList(items));
    }

    public void addItem(String name, String type, int quantity) {
        this.items.add(new Fruit(name, type, quantity));
    }

    public void addItem(String name,  String type, int quantity, int damage) {
        this.items.add(new Weapon(name, type, quantity, damage));
    }

    public void removeItem(final Item item) {
        this.items.remove(item);
    }

    public Item getItem(final int index) {
        return this.items.get(index);
    }

    public void displayInventory(){
        this.items.forEach(Item::displayInfo);
    }

    public void displayInventory(final String type){
        this.items.stream()
                .filter(item -> (item instanceof Fruit || item instanceof Weapon) && item.getType().equalsIgnoreCase(type))
                .findFirst()
                .ifPresent(Item::displayInfo);
    }
}
