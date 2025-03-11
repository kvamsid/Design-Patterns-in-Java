package LowLevelDesign.vamsiPractise.TemplateMethodDesignPattern;

public class PaytoFriend extends PaymentTemplateMethod {

    @Override
    public void validatePayment(){
        System.out.println("Validating Payment for Friend");
    }

    @Override
    public void calculateFees(){
        System.out.println("0% Fees for Friend");
    }

    @Override
    public void debitMoney(){
        System.out.println("Debit Money for Friend");
    }

    @Override
    public void creditMoney(){
        System.out.println("Credit Money for Friend");
    }
}
