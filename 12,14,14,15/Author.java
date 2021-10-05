package com.pompi;
import java.util.Comparator;

public class Author implements Comparator<Book>{
    @Override
    public int compare(Book obj1, Book obj2) {
        return obj1.getAuthor().compareTo(obj2.getAuthor());
    }
}
