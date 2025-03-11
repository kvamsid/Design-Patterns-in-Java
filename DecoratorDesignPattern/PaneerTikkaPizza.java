package LowLevelDesign.vamsiPractise.DecoratorDesignPattern;

public class PaneerTikkaPizza extends BasePizza{

    public int cost(){
        System.out.println("Paneer Tikka Pizza");
        return 300;
    }
}
