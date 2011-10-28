package edu.rit.taskers.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.rit.taskers.model.Actionable;
import edu.rit.taskers.model.Event;
import edu.rit.taskers.persistence.EventDao;

/**
 * Handles requests with a space related to events.
 */
@Controller
@RequestMapping("/events")
public class EventController {

	private static final Logger logger = LoggerFactory.getLogger(EventController.class);

    @Autowired
    private EventDao eventDao;
    
	/**
	 * Fetch all events that belong to session space id
	 * @return Collection of events
	 */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getAllEvents() {
		//TODO - Session space ID
		ModelAndView eventsMainPage = new ModelAndView("events", "allevents", eventDao.findAll());
		return eventsMainPage;
	}

	/**
	 * Retrieve the event details from a selected event in the list
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ModelAndView getEventDetails(@PathVariable int id) {
		ModelAndView eventDetailsEditPage = new ModelAndView("editevent", "event", eventDao.findById(id));
		return eventDetailsEditPage;
	}

	/**
	 * Create New Event page requested
	 */
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public ModelAndView getCreateEventPage() {
		ModelAndView newEventPage = new ModelAndView("newevent");
		return newEventPage;
	}
	
	/**
	 * Create New Event from js function with form data parameters
	 */
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public @ResponseBody String createNewEvent(@RequestParam(value="title") String taskName,
								 @RequestParam(value="targetdate") String targetDate,
								 @RequestParam(value="targettime") String targettime,
								 @RequestParam(value="description") String desc) {
		String resultMsg = "";
		try {
			// Specify the date format received from the UI
			DateFormat df = new SimpleDateFormat(Actionable.ACTION_UI_DATEFORMAT);
			DateFormat dft = new SimpleDateFormat("h:m a");
			
			// Heavyweight, ugly way to generate one datetime stamp from our separated date and time
			// without the help of a third-party library (such as Joda time)
			Date date = df.parse(targetDate);
			Date time = dft.parse(targettime);

			Calendar calendarA = Calendar.getInstance();
			calendarA.setTime(date);

			Calendar calendarB = Calendar.getInstance();
			calendarB.setTime(time);

			calendarA.set(Calendar.HOUR_OF_DAY, calendarB.get(Calendar.HOUR_OF_DAY));
			calendarA.set(Calendar.MINUTE, calendarB.get(Calendar.MINUTE));
			calendarA.set(Calendar.SECOND, calendarB.get(Calendar.SECOND));
			calendarA.set(Calendar.MILLISECOND, calendarB.get(Calendar.MILLISECOND));

			Date resultDate = calendarA.getTime();

			// Create the new event object and persist it
			Event newEvent = new Event();
			newEvent.setName(taskName);
			newEvent.setTargetDate(resultDate);
			newEvent.setDescription(desc);
			
			eventDao.save(newEvent);
			resultMsg = "Event successfully created.";
			
		} catch (ParseException e) {
			e.printStackTrace();
			resultMsg = "Please specify a date and time.";
		}
		return resultMsg;
	}
}
