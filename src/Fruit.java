public class Fruit extends Item implements ItemStuff{
    public Fruit(String name, String type, int quantity) {
        super(name, type, quantity);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public void displayInfo() {
        System.out.println(STR."Weapon: \{getName()}, Type: \{getType()}, Quantity: \{getQuantity()}");
    }
}
