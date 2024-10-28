import java.util.Random;

public static void main(String[] args) {
    final Inventory inventory = new Inventory();

    final Random random = new Random();

    final Fruit apple = new Fruit("Pomme", "Golden", random.nextInt(100));
    final Weapon sword = new Weapon("Epee", "Rapiere", random.nextInt(100), 10);

    inventory.addItem(apple, sword);

    inventory.displayInventory();
    inventory.displayInventory(apple.getType());
}
