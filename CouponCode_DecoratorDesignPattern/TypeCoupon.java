package LowLevelDesign.vamsiPractise.CouponCode_DecoratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class TypeCoupon extends CouponDecorator{

    Product product;
    int discountPercent;
    ProductType type;
    static List<ProductType> eligibleTypes = new ArrayList<>();
    static{
        eligibleTypes.add(ProductType.ELECTRONICS);
        eligibleTypes.add(ProductType.GROCERY);
    }

    public TypeCoupon(Product product, int discountPercent, ProductType prodType){
        this.product = product;
        this.discountPercent = discountPercent;
        this.type = prodType;
    }

    public double getPrice(){
        double price = product.getPrice();
        if(eligibleTypes.contains(type)){
            price -= (price*discountPercent)/100;
        }
        return price;
    }
}
