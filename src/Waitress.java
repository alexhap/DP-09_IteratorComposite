/**
 * Created by alex on 26.06.2015.
 *
 */

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinnerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator pancakeMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerMenuIterator = dinnerMenu.createIterator();
        printMenu(pancakeMenuIterator);
        printMenu(dinnerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        System.out.println("\nMENU: " + iterator.getClass().getName());
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.printf("%s, %8.2f -- %s\n", item.getName(), item.getPrice(), item.getDescription());
        }
    }

    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);
        waitress.printMenu();
    }
}
