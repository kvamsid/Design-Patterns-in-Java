package LowLevelDesign.vamsiPractise.DecoratorDesignPattern;

public class ExtraJalapenos extends BaseTopping{
    BasePizza basePizza;
    public ExtraJalapenos(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost(){
        System.out.println("Spicyyyyyy Jalapenos Added!!!!!!");
        return basePizza.cost() + 50;
    }
}
