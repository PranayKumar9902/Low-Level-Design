package CompositePattern;

import CompositePattern.components.CompositeMenu;
import CompositePattern.components.MenuComponent;

public class Main {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new CompositeMenu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new CompositeMenu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new CompositeMenu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new CompositeMenu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new CompositeMenu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(
                new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(
                new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));


        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
