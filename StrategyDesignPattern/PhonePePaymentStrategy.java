package LowLevelDesign.vamsiPractise.StrategyDesignPattern;

public class PhonePePaymentStrategy implements PaymentStrategyInterface{

    int accNumber;
    int upiId;
    public PhonePePaymentStrategy(int accNumber, int upiId) {
        this.accNumber = accNumber;
        this.upiId = upiId;
    }

    public void pay(int amount){
        System.out.println("PhonePe Strategy used here "+ accNumber + " " + upiId + " " + amount);
    }
}
