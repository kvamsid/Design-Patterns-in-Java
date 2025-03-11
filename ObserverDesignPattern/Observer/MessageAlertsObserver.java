package LowLevelDesign.vamsiPractise.ObserverDesignPattern.Observer;

import LowLevelDesign.vamsiPractise.ObserverDesignPattern.Observable.IphoneProductObservable;

public class MessageAlertsObserver implements NotificationsObserver{

    IphoneProductObservable iphoneProductObservable;
    String userName;

    public MessageAlertsObserver(String userName, IphoneProductObservable iphoneProductObservable) {
        this.userName = userName;
        this.iphoneProductObservable = iphoneProductObservable;
    }
    @Override
    public void update() {
        System.out.println(iphoneProductObservable.getData()+" stock alert for I-phones on messages to "+userName);
    }
}
