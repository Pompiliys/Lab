package com.pompi;
import java.util.Comparator;

public class Title implements Comparator<Book>{
    @Override
    public int compare(Book obj1, Book obj2) {
        return obj1.getTitle().compareTo(obj2.getTitle());
    }
}
