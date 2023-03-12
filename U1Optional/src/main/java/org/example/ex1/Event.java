package org.example.ex1;

import java.util.Date;

public class Event {
    String id;
    Date date;
    Float hour;

    public Event(String id, Date date, Float hour) {
        this.id = id;
        this.date = date;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", hour=" + hour +
                '}';
    }
}
