/**
 * Created by alex on 25.06.2015.
 *
 */

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu extends MenuComponent {

    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
