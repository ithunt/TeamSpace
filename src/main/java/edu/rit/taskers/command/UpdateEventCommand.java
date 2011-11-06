package edu.rit.taskers.command;

import edu.rit.taskers.model.Event;
import edu.rit.taskers.persistence.EventDao;

import java.util.Calendar;

/**
 * @author ian hunt
 * @date 11/4/11
 */


public class UpdateEventCommand{


    private Event event;
    private EventDao eventdao;

    public UpdateEventCommand(Event event, EventDao eventdao) {
        this.event = event;
        this.eventdao = eventdao;
    }

    public void execute() {
        if(event.getId() != 0) {
            eventdao.update(event);
        } else {
            event.setCreated(Calendar.getInstance().getTime());
            eventdao.save(event);
        }

    }

}
