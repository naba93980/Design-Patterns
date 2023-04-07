package ObserverPattern.publisher;

import java.util.ArrayList;
import java.util.List;
import ObserverPattern.subscriber.Observer;

public class MyTopic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null)
            throw new NullPointerException("Null Observer");
        if (!observers.contains(obj))
            observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        {
            observers.remove(obj);
        }
    }

    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic:" + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
    
    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        {
            if (!changed)
                return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer obj : observersLocal) {
            obj.update();
        }

    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }


}
