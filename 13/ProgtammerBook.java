package com.pompi2;
import pompi.Book;
import java.util.Objects;

class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object object) {
        ProgrammerBook programmerBook = (ProgrammerBook) object;
        return level == programmerBook.level &&
                language.equals(programmerBook.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return "ProgrammerBook "+super.getTitle() + " Author" + super.getAuthor() + " Price" + super.getPrice() + " Language" + language + "Level " + level;
    }
}
