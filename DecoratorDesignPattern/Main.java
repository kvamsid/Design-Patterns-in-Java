package LowLevelDesign.vamsiPractise.DecoratorDesignPattern;

public class Main {

    public static void main(String[] args) {
        BasePizza vamsiFavPizza = new ExtraJalapenos(new CheeseBurst(new CheeseBurst(new PaneerTikkaPizza())));
        System.out.println(vamsiFavPizza.cost());
    }
}
