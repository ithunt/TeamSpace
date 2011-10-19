package edu.rit.taskers;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import edu.rit.taskers.model.Contact;

/**
 * Handles requests within a space related to people (contact cards).
 */
@Controller
@RequestMapping("/people")
public class PeopleController {

	private static final Logger logger = LoggerFactory.getLogger(PeopleController.class);

	/**
	 * Fetch all contact cards that belong to session space id
	 * @return Collection of contact cards
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ArrayList<Contact> getAllContacts() {
		//TODO
		return null;
	}

	/**
	 * Retrieve the contact card from a selected person in the list
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public @ResponseBody Contact getContactDetails(@PathVariable int id) {
		logger.info("Retrieving contact card [ID:" + id + "]");

		//TODO
		Contact returnContact = null;

		return returnContact;
	}
}
