package computer.peripherals;

import java.util.ArrayList;
import java.util.List;

import computer.Event;
import computer.Peripheral;
import computer.Program;

public class Monitor implements Peripheral, Program {
    private String name;
    private List<Program> subscribers;
    
    public Monitor(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    public void notify(Event event) {
        System.out.println("Monitor: " + event.getCreator() + " created " + event.getMessage());
    }

    @Override
    public void addSubscriber(Program newSubscriber) {
        this.subscribers.add(newSubscriber);
        
    }

    @Override
    public void createEvent(String message) {
        Event event = new Event(name, message, false);
        
        for (Program sub : subscribers) {
            sub.notify(event);
        }
    }

    @Override
    public void removeSubscriber(Program oldSubscriber) {
        subscribers.remove(oldSubscriber);
        
    }

    public void adjustBrightness(Integer newBrightness) {
        createEvent(newBrightness.toString());
    }

}
