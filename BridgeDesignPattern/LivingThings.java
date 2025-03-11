package LowLevelDesign.vamsiPractise.BridgeDesignPattern;

public abstract class LivingThings {
    BreatheImplementor breatheImplementor;
    public LivingThings(BreatheImplementor breatheImplementor){
        this.breatheImplementor = breatheImplementor;
    }

    abstract void setBreatheImplementor();
}
