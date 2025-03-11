package LowLevelDesign.vamsiPractise.ObserverDesignPattern.Observable;

import LowLevelDesign.vamsiPractise.ObserverDesignPattern.Observer.NotificationsObserver;

import java.util.List;

public interface IphoneProductObservable {

    public void addObserver(NotificationsObserver observer);

    public void removeObserver(NotificationsObserver observer);

    public void notifyObservers();

    public void setData(int stock);

    public int getData();
}
