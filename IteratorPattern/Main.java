package IteratorPattern;

import IteratorPattern.Menus.Menu;
import IteratorPattern.Menus.PanCakeHouseMenu;

import java.util.List;

import IteratorPattern.Menus.CafeMenu;
import IteratorPattern.Menus.DinerMenu;

public class Main {
    
    public static void main(String[] args) {

        List<Menu> menus = List.of(new PanCakeHouseMenu(), new DinerMenu(), new CafeMenu());
        Waitress waitress = new Waitress(menus);
        
        waitress.printMenu();
    }
}
