package LowLevelDesign.vamsiPractise.ObserverDesignPattern;

import LowLevelDesign.vamsiPractise.ObserverDesignPattern.Observable.IphoneProductObservable;
import LowLevelDesign.vamsiPractise.ObserverDesignPattern.Observable.IphoneProductObservableImpl;
import LowLevelDesign.vamsiPractise.ObserverDesignPattern.Observer.EmailAlertsObserver;
import LowLevelDesign.vamsiPractise.ObserverDesignPattern.Observer.MessageAlertsObserver;
import LowLevelDesign.vamsiPractise.ObserverDesignPattern.Observer.NotificationsObserver;

public class Client {

    public static void main(String args[]){

        IphoneProductObservable obs = new IphoneProductObservableImpl();

        NotificationsObserver user1 = new EmailAlertsObserver("vamsi@asu.edu", obs);
        NotificationsObserver user2 = new MessageAlertsObserver("Vikram", obs);

        obs.addObserver(user1);
        obs.addObserver(user2);
        obs.setData(10);
    }
}
