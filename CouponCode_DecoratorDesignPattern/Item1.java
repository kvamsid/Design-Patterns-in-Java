package LowLevelDesign.vamsiPractise.CouponCode_DecoratorDesignPattern;

public class Item1 extends Product{

    public Item1(String name, double price, ProductType productType){
        super(name, price, productType);
    }

    @Override
    public double getPrice(){
        return prodPrice;
    }
}
