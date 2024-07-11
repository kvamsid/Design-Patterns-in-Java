package LowLevelDesign.vamsiPractise.CouponCode_DecoratorDesignPattern;

public class Item2 extends Product{
    public Item2(String name, double price, ProductType productType){
        super(name, price, productType);
    }

    @Override
    public double getPrice(){
        return prodPrice;
    }
}
