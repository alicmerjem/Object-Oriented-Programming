package org.example.abstraction;

abstract class EventManager {
    abstract void scheduleEvent(String eventDate);
}

class OnlineEventManager extends EventManager {
    private String eventName;
    private String scheduledDate;

    public OnlineEventManager(String eventName) {
        this.eventName = eventName;
        this.scheduledDate = "";
    }

    public String getEventName() { return eventName; }

    @Override
    public void scheduleEvent(String eventDate) {
        this.scheduledDate = eventDate;
        System.out.println("Event " + eventName + " scheduled for " + this.scheduledDate + ".");
    }
}