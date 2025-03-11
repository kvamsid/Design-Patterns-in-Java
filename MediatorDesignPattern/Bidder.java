package LowLevelDesign.vamsiPractise.MediatorDesignPattern;

public class Bidder implements Colleague{
    String myName;
    Mediator mediator;

    public Bidder(String name, Mediator mediator){
        this.myName = name;
        this.mediator = mediator;
        mediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount){
        mediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveNotification(Colleague bidder, int bidAmount) {
        System.out.println(myName + " received notification for " + bidder.getName() + " with " + bidAmount);
    }

    @Override
    public String getName(){
        return myName;
    }

}
