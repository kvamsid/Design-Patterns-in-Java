package LowLevelDesign.vamsiPractise.MediatorDesignPattern;

public class Main {
    public static void main(String[] args) {

        Mediator mediator = new Mediator1();
        Colleague vamsi = new Bidder("Vamsi", mediator);
        Colleague vinay = new Bidder("Vinay", mediator);
        vamsi.placeBid(1000);
        vinay.placeBid(2000);
    }
}
