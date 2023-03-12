package org.example.ex1;

import java.util.Date;
import java.util.UUID;

public class DataBase {
    public Event getEvent(){
        return new Event(UUID.randomUUID().toString(),new Date(2),16F);
    }

    //here we need to use Optional
    public Event findById(String id){
        Event result = null;
        // searching in db
        return result;
    }
}
