package com.pompi;
import java.util.Objects;

public class Book implements Cloneable, Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edittion;
    private int isbn;

    public String getTitle() {
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object object){
        Book book = (Book) object;
        return price == book.price
                && Objects.equals(title, book.title)
                && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return String.format(title + " " + author);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Book book) {
        if (this.isbn > book.isbn) {
            return 1;
        } else {
            return 0;
        }
    }
}
