package LowLevelDesign.vamsiPractise.TemplateMethodDesignPattern;

public class Main {

    public static void main(String[] args) {
        PaymentTemplateMethod payToFriend = new PaytoFriend();
        payToFriend.sendMoney();

        PaymentTemplateMethod payMerchant = new PayMerchant();
        payMerchant.sendMoney();
    }
}
