/**
 * Created by alex on 26.06.2015.
 *
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;
    Iterator iterator = null;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent get(int index) {
        return menuComponents.get(index);
    }

    public void print() {
        System.out.println("\n" + getName() + " - " + getDescription() + "\n--------------------------");
        for (MenuComponent comp : menuComponents)
            comp.print();
    }

    public Iterator createIterator() {
        if (iterator == null)
            iterator = new CompositeIterator(menuComponents.iterator());
        return iterator;
    }
}
