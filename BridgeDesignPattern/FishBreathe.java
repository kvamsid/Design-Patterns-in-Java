package LowLevelDesign.vamsiPractise.BridgeDesignPattern;

public class FishBreathe extends LivingThings{
    public FishBreathe(BreatheImplementor breathe) {
        super(breathe);
    }

    public void setBreatheImplementor() {
        System.out.println("Fish Breathe Process");
        breatheImplementor.breatheProcess();
    }
}
