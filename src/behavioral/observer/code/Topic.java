package behavioral.observer.code;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {

    private List<Observer> observers;

    private String message;

    public Topic() {
        this.observers = new ArrayList<>();
        this.message = "";
    }

    @Override
    public void register(Observer obj) {
        if (!observers.contains(obj)) {
            observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer obj) {
        return message;
    }

    public void postMessage(String message) {
        System.out.println("Message sent to Topic: " + message);
        this.message = message;
        notifyObservers();
    }
}
