package LowLevelDesign.vamsiPractise.CouponCode_DecoratorDesignPattern;

public abstract class Product {

    ProductType prodType;
    double prodPrice;
    String prodName;

    public Product(){}

    public Product(String prodName, double prodPrice, ProductType prodType){
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.prodType = prodType;
    }

    public abstract double getPrice();

    public ProductType getProdType(){
        return prodType;
    }
}
