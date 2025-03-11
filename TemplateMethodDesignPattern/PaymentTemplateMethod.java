package LowLevelDesign.vamsiPractise.TemplateMethodDesignPattern;

public abstract class PaymentTemplateMethod {
    public abstract void validatePayment();
    public abstract void calculateFees();
    public abstract void debitMoney();
    public abstract void creditMoney();

    public final void sendMoney(){
        validatePayment();
        calculateFees();
        debitMoney();
        creditMoney();
    }
}
