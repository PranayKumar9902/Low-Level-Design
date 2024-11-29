package IteratorPattern.Menus;

import java.util.Iterator;

import IteratorPattern.MenuItem;

public interface Menu {
    
    public Iterator<MenuItem> createIterator();
}
