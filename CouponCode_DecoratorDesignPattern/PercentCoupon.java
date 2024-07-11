package LowLevelDesign.vamsiPractise.CouponCode_DecoratorDesignPattern;

public class PercentCoupon extends CouponDecorator{

    Product product;
    int discountPercent;

    public PercentCoupon(Product product, int discountPercent){
        this.product = product;
        this.discountPercent = discountPercent;
    }

    @Override
    public double getPrice(){
        double price = product.getPrice();
        return (price - (price*discountPercent)/100);
    }
}
