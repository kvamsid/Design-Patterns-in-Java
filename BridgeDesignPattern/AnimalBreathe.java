package LowLevelDesign.vamsiPractise.BridgeDesignPattern;

public class AnimalBreathe extends LivingThings{

    public AnimalBreathe(BreatheImplementor breathe) {
        super(breathe);
    }

    public void setBreatheImplementor(){
        System.out.println("From Animal Class Calling breathe Process");
        breatheImplementor.breatheProcess();
    }
}
