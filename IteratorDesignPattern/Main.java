package LowLevelDesign.vamsiPractise.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Fire And Blood", 2000));
        bookList.add(new Book("Game of Thrones", 3000));
        bookList.add(new Book("Song of Ice and Fire", 2500));
        bookList.add(new Book("Dance of the Dragons", 2200));

        Library lib = new Library(bookList);
        Iterator iterator = lib.createIterator();

        while(iterator.hasNext()) {
            Book book = (Book) iterator.next();
            if(book.getPrice() > 2200){
                System.out.println("The book " + book.getTitle() + " is costly");
            }else{
                System.out.println("The book " + book.getTitle() + " is cheap");
            }

        }
    }


}
