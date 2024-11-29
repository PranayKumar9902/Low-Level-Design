package IteratorPattern.Iterators;

import java.util.Iterator;


import IteratorPattern.MenuItem;

public class DinerMenuIterator implements Iterator<MenuItem>{

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        
        if(position >= items.length || items[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        
        MenuItem item = items[position];
        position = position+1;
        return item;
    }
    
}
