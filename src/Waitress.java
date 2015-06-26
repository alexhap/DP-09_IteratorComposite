import java.util.Iterator;

/**
 * Created by alex on 26.06.2015.
 *
 */

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU!\n-------------------------");
        while(iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof MenuItem && component.isVegetarian())
                component.print();
        }
    }

    public static void main(String args[]) {

        MenuComponent allMenus = new Menu("ALL MENU", "All menus combined in one list");
        Menu dinner = new Menu("DINNER MENU", "Lunch");
        Menu cafeMenu = new Menu("CAFE MENU", "Dinner");
        Menu pancake = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        Menu dessert = new Menu("DESSERT MENU", "Dessert of course!");

        allMenus.add(pancake);
        allMenus.add(dinner);
        allMenus.add(cafeMenu);

        pancake.add(new MenuItem("K&B Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99));
        pancake.add(new MenuItem("Regular pancake breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        pancake.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
        pancake.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));

        dinner.add(new MenuItem("Vegetarian BLT", "(Faking) Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinner.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinner.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29));
        dinner.add(new MenuItem("HotDog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05));

        dessert.add(new MenuItem("Apple Pie", "Apple pie with a flaky crust, topped with vanilla ice-cream", true, 1.59));
        dessert.add(new MenuItem("Cheesecake", "Creamy New York cheesecake, with a chocolate graham crust", true, 1.99));
        dessert.add(new MenuItem("Sorbet", "A scoop of raspberry and a scoop of lime", true, 1.89));

        dinner.add(dessert);

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie Burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the Soup of the day, with a side salad", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large Burrito with whole pinto beans, salsa, guacamole", true, 4.29));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
