package CompositePattern;

import CompositePattern.components.MenuComponent;

public class Waitress {
    
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}
