package LowLevelDesign.vamsiPractise.IteratorDesignPattern;

public class Book {
    private String title;
    private int price;

    Book(String title, int price){
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice(){
        return price;
    }
}
