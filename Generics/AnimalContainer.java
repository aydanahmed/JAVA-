package test;

import java.util.ArrayList;
import java.util.Collection;

public class AnimalContainer<T extends Animal> {

    private Collection<T> col;

    public AnimalContainer() {
        col = new ArrayList<T>();
    }

    public void add(T t) {
        col.add(t);
    }

    public void printAllSounds() {
        for (T t : col) {
          
            System.out.println(t.getSound()); 
        }
    }
}
