package LowLevelDesign.vamsiPractise.DecoratorDesignPattern;

public class CheeseBurst extends BaseTopping{
    BasePizza cheeseBurst;
    public CheeseBurst(BasePizza basePizza) {
        this.cheeseBurst = basePizza;
    }
    public int cost(){
        System.out.println("Cheeeeeessssssssseeeeeeeeeeeeee Burstttttttttttt");
        return cheeseBurst.cost() + 100;
    }
}
