package LowLevelDesign.vamsiPractise.TemplateMethodDesignPattern;

public class PayMerchant extends PaymentTemplateMethod{

    @Override
    public void validatePayment(){
        System.out.println("Validating Payment for Merchant");
    }

    @Override
    public void calculateFees(){
        System.out.println("10% Fees for Merchant");
    }

    @Override
    public void debitMoney(){
        System.out.println("Debit Money for Merchant");
    }

    @Override
    public void creditMoney(){
        System.out.println("Credit Money for Merchant");
    }

}
