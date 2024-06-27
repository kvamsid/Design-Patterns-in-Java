package LowLevelDesign.vamsiPractise.StrategyDesignPattern;

public class CCPaymentStrategy implements PaymentStrategyInterface{

    int ccNumber;
    int ccName;

    public CCPaymentStrategy(int ccNumber, int ccName) {
        this.ccNumber = ccNumber;
        this.ccName = ccName;
    }

    @Override
    public void pay(int amount){
        System.out.println("CCPaymentStrategy: Paying " + amount + " " + ccName);
    }
}
