package computer.peripherals;

import java.util.ArrayList;
import java.util.List;

import computer.Event;
import computer.Peripheral;
import computer.Program;

public class Mouse implements Peripheral {

    private String name;
    private List<Program> subscribers;

    public Mouse(String name) {
        this.name = name;
        this.subscribers = new ArrayList<Program>();
    }

    @Override
    public void addSubscriber(Program newSubscriber) {
        this.subscribers.add(newSubscriber);
    }

    @Override
    public void createEvent(String message) {
        // TODO: implement
        Event event = new Event(name, message, false);
        for (Program subscriber : subscribers) {
            subscriber.notify(event);
        }
    }

    @Override
    public void removeSubscriber(Program oldSubscriber) {
        this.subscribers.remove(oldSubscriber);
    }

    public void leftClick() {
        createEvent("left click");
    }

    public void rightCLick() {
        createEvent("right click");
    }
    
}
