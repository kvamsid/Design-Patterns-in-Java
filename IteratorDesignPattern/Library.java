package LowLevelDesign.vamsiPractise.IteratorDesignPattern;

import java.util.List;

public class Library implements Aggregate{
    private List<Book> booksList;

    public Library(List<Book> booksList) {
        this.booksList = booksList;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(booksList);
    }
}
