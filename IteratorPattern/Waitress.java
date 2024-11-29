package IteratorPattern;

import java.util.Iterator;
import java.util.List;

import IteratorPattern.Menus.Menu;

public class Waitress {
    
    List<Menu>menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu(){
        
        Iterator<Menu> menuIterator = menus.iterator();

        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
            System.out.println();
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();

            System.out.print(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice());
            System.out.println("   -- " + menuItem.getDescription());
        }
    }
}
