package edu.rit.taskers.command;

import edu.rit.taskers.model.Event;
import edu.rit.taskers.persistence.EventDao;

import java.util.Calendar;
import java.util.List;

/**
 * @author ian hunt
 * @date 11/4/11
 */


public class UpdateEventCommand{


    private Event event;
    private EventDao eventdao;
    private List<Integer> invitees;

    public UpdateEventCommand(Event event, EventDao eventdao, List<Integer> invitees) {
        this.event = event;
        this.eventdao = eventdao;
        this.invitees = invitees;
    }

    public void execute() {
        int eventId = 0;
        if(event.getId() != 0) {
            eventdao.update(event);
            eventId = event.getId();
            eventdao.clearInvitees(eventId);
        } else {
            event.setCreated(Calendar.getInstance().getTime());
            eventId = eventdao.save(event);
        }

        if(invitees != null) {
            eventdao.addInvitees(eventId, invitees);
        }
    }

}
