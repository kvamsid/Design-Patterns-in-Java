package LowLevelDesign.vamsiPractise.ObserverDesignPattern.Observable;

import LowLevelDesign.vamsiPractise.ObserverDesignPattern.Observer.NotificationsObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneProductObservableImpl implements IphoneProductObservable {

    List<NotificationsObserver> observers = new ArrayList<>();
    public int stock;

    @Override
    public void addObserver(NotificationsObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationsObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationsObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setData(int newStock) {
        if (stock == 0 && newStock > 0) {  // Notify only if stock was 0 and is now increasing
            stock += newStock;
            notifyObservers();
        } else {
            stock += newStock;
        }
    }

    @Override
    public int getData() {
        return this.stock;
    }
}
