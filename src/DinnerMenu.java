/**
 * Created by alex on 25.06.2015.
 *
 */

import java.util.Iterator;

public class DinnerMenu implements Menu {

    private static final int MAX_ITEMS = 6;
    private int itemCount;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (itemCount >= MAX_ITEMS)
            System.out.println("Sorry! menu is full! Can`t add item to menu.");
        else
            menuItems[itemCount++] = new MenuItem(name, description, vegetarian, price);
    }

    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }

}
