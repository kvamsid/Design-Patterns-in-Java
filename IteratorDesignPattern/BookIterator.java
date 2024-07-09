package LowLevelDesign.vamsiPractise.IteratorDesignPattern;

import java.util.List;

public class BookIterator implements Iterator{

    private List<Book> booksList;
    private int index = 0;

    public BookIterator(List<Book> booksList) {
        this.booksList = booksList;
    }

    @Override
    public Boolean hasNext(){
        return index < booksList.size();
    }

    @Override
    public Object next(){
        if(this.hasNext()){
            return booksList.get(index++);
        }else{
            return null;
        }
    }
}
