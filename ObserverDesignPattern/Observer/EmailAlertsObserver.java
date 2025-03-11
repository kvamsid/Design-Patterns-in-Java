package LowLevelDesign.vamsiPractise.ObserverDesignPattern.Observer;

import LowLevelDesign.vamsiPractise.ObserverDesignPattern.Observable.IphoneProductObservable;

import java.util.Observer;

public class EmailAlertsObserver implements NotificationsObserver{

    IphoneProductObservable iphoneProductObservable;
    String emailId;

    public EmailAlertsObserver(String emailId, IphoneProductObservable iphoneProductObservable) {
        this.emailId = emailId;
        this.iphoneProductObservable = iphoneProductObservable;
    }
    @Override
    public void update() {
        System.out.println(iphoneProductObservable.getData()+" stock alert for I-phones on mail to "+ emailId);
    }
}
