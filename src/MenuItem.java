import java.util.Iterator;

/**
 * Created by alex on 25.06.2015.
 *
 */

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.printf("%s%s, %.2f\n\t --- %s\n", getName(), isVegetarian() ? " (v)" : "", getPrice(), getDescription());
    }

    public Iterator createIterator() {
        return new NullIterator();
    }
}
