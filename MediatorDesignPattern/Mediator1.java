package LowLevelDesign.vamsiPractise.MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Mediator1 implements Mediator {
    List<Colleague> colleagues = new ArrayList<Colleague>();

    public void addBidder(Colleague bidder){
        colleagues.add(bidder);
    }

    public void placeBid(Colleague bidder, int bidAmount){
        for(Colleague colleague : colleagues){
            if(!colleague.getName().equals(bidder.getName())){
                colleague.receiveNotification(bidder, bidAmount);
            }
        }
    }
}
