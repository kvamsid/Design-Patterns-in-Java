package LowLevelDesign.vamsiPractise.CouponCode_DecoratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    public void addProduct(Product product) {
        Product productAfterCoupon = new PercentCoupon(new TypeCoupon(product, 5, product.prodType), 10);
        shoppingCart.add(productAfterCoupon);
    }

    public double totalPrice(){
        double result = 0;
        for(Product product : shoppingCart){
            result += product.getPrice();
        }
        return result;
    }
}
