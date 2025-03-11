package LowLevelDesign.vamsiPractise.MediatorDesignPattern;

public interface Colleague {
    public void placeBid(int bidAmount);
    public void receiveNotification(Colleague bidder, int bidAmount);
    public String getName();
}
