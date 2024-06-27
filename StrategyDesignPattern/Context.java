package LowLevelDesign.vamsiPractise.StrategyDesignPattern;

public class Context {

    PaymentStrategyInterface paymentStrategy;

    public void setPaymentStrategy(PaymentStrategyInterface paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount){
        paymentStrategy.pay(amount);
    }

}
