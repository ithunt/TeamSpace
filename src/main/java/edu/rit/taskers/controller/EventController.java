package edu.rit.taskers.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
		//TODO
		ModelAndView test = new ModelAndView("events");
		return test;
	}

	/**
	 * Retrieve the event details from a selected event in the list
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public @ResponseBody Event getEventDetails(@PathVariable int id) {
		logger.info("Retrieving event details [ID:" + id + "]");

		//TODO
		Event returnEvent = null;

		return returnEvent;
	}
}
