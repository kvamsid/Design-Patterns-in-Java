package LowLevelDesign.vamsiPractise.BridgeDesignPattern;

public class Main {
    public static void main(String[] args) {
        LivingThings bird = new AnimalBreathe(new WaterBreathe());
        bird.setBreatheImplementor();
    }
}
