package edu.rit.taskers.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.rit.taskers.persistence.ContactDao;

/**
 * Handles requests within a space related to people (contact cards).
 */
@Controller
@RequestMapping("/people")
public class PeopleController {

	private static final Logger logger = LoggerFactory.getLogger(PeopleController.class);
	
    @Autowired
    private ContactDao contactDao;

	/**
	 * Fetch all contact cards that belong to session space id
	 * @return Collection of contact cards
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getAllContacts() {
		//TODO - Session space ID
		ModelAndView peopleJspAndContactsPage = new ModelAndView("people", "contacts", contactDao.findAll());
		return peopleJspAndContactsPage;
	}

	/**
	 * Retrieve the contact card from a selected person in the list
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ModelAndView getContactDetails(@PathVariable int id) {
		ModelAndView viewContactPage = new ModelAndView("viewcontact", "contact", contactDao.findById(id));
		return viewContactPage;
	}

	/**
	 * Invite Contact page requested
	 */
	@RequestMapping(value="/invite", method=RequestMethod.GET)
	public ModelAndView getInvitePage() {
		ModelAndView inviteContactPage = new ModelAndView("invite");
		return inviteContactPage;
	}
	
	/**
	 * Search contacts for with email address specified by client
	 */
//	@RequestMapping(value="/invite/{email}", method=RequestMethod.POST)
//	public @ResponseBody boolean searchForContact(@RequestParam String email) {
//		//TODO figure out email format validation location (probably client side)
//		logger.info("Searching contacts with inputted email address [email:" + email + "]");
//		return true;
//	}
}
