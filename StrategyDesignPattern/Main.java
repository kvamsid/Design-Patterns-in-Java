package LowLevelDesign.vamsiPractise.StrategyDesignPattern;

public class Main {

    public static void main(String[] args) {
        Context vamsiContext = new Context();
        vamsiContext.setPaymentStrategy(new CCPaymentStrategy(111111, 99900));

        vamsiContext.pay(10000);
    }
}
