package IteratorPattern.Menus;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import IteratorPattern.MenuItem;

public class CafeMenu implements Menu {

    Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu() {

        addItem("Veggie Burger", "A delicious veggie burger with lettuce, tomato, and cheese", true, 5.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito with whole pinto beans, salsa, guacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {

        return menuItems.values().iterator();
    }

}
