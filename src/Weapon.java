public class Weapon extends Item implements ItemStuff{

    private final int damage;

    public Weapon(String name, String type, int quantity, int damage) {
        super(name, type, quantity);
        this.damage = damage;
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

    public double getDamage() {
        return this.damage;
    }

    @Override
    public void displayInfo() {
        System.out.println(STR."Weapon: \{getName()}, Type: \{getType()}, Quantity: \{getQuantity()}, Damage: \{getDamage()}");
    }
}
