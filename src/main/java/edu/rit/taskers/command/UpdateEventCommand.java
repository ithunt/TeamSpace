package edu.rit.taskers.command;

import edu.rit.taskers.model.Event;
import edu.rit.taskers.persistence.EventDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;

/**
 * @author ian hunt
 * @date 11/4/11
 */


public class UpdateEventCommand{


    private Event event;

    @Autowired
    private EventDao eventdao;

    public UpdateEventCommand(Event event){
        this.event = event;
    }

    public void execute() {

        event.setCreated(Calendar.getInstance().getTime());

        if(event.getId() != 0) {
            eventdao.update(event);
        } else {
            eventdao.save(event);
        }

    }


}
