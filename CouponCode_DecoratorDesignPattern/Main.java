package LowLevelDesign.vamsiPractise.CouponCode_DecoratorDesignPattern;

public class Main {

    public static void main(String[] args){
        Product laptop = new Item1("MacBook", 2000, ProductType.ELECTRONICS);
        Product phone = new Item1("IPhone", 1000, ProductType.ELECTRONICS);
        Product broom = new Item2("broom", 100, ProductType.GROCERY);
        Product sofa = new Item2("sofa", 1000, ProductType.HOME_DECOR);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(laptop);
        shoppingCart.addProduct(phone);
        shoppingCart.addProduct(broom);
        shoppingCart.addProduct(sofa);

        System.out.println("The total Price after discounts is " + shoppingCart.totalPrice());
    }
}
