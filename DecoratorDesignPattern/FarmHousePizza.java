package LowLevelDesign.vamsiPractise.DecoratorDesignPattern;

public class FarmHousePizza extends BasePizza{
    public int cost(){
        System.out.println("Farm house pizza");
        return 200;
    }
}
