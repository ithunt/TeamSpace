package edu.rit.taskers.controller;

import edu.rit.taskers.command.UpdateContactCommand;
import edu.rit.taskers.model.Contact;
import edu.rit.taskers.persistence.ContactDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView getAllContacts(@CookieValue("SPACE") int id) {
		ModelAndView peopleJspAndContactsPage = new ModelAndView("people", "allcontacts", contactDao.findBySpace(id));
		return peopleJspAndContactsPage;
	}

	/**
	 * Retrieve the contact card from a selected person in the list
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ModelAndView getContactDetails(@PathVariable int id) {
		ModelAndView contactDetailsPage = new ModelAndView("viewcontact", "contact", contactDao.findById(id));
		return contactDetailsPage;
	}

	/**
	 * Invite Contact page requested
	 */
	@RequestMapping(value="/invite", method=RequestMethod.GET)
	public ModelAndView getInvitePage() {
		ModelAndView inviteContactPage = new ModelAndView("invite");
		return inviteContactPage;
	}


    @RequestMapping(value="/{id]", method = RequestMethod.POST)
    public @ResponseBody String updateContact(@PathVariable int id,
                                              @RequestParam(value="name") String name,
                                              @RequestParam(value="phone") String phone,
                                              @RequestParam(value="email") String email,
                                              @RequestParam(value="bio") String bio,
                                              @RequestParam(value="pictureurl") String pictureUrl) {

        if( isEmpty(name) || isEmpty(phone) || isEmpty(email) )
            return "name, phone, email cannot be empty";

        Contact c = contactDao.findById(id);
        c.setName(name);
        c.setPhone(phone);
        c.setEmail(email);
        c.setBio(bio);
        c.setPictureURL(pictureUrl);

        UpdateContactCommand cmd = new UpdateContactCommand(c, contactDao);
        cmd.execute();

        return "Comment Updated";
    }

    /**
     * delete a contact
     * @param id contact id
     * @return redirect
     */
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
        Contact c = contactDao.findById(id);
        contactDao.delete(c);
        return "redirect:/people";
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

    /**
	 * String isEmpty helper method
	 */
	private boolean isEmpty(String s) {
		return ( s == null ) || ( "".equals(s) ) || ( s.length() == 0 );
	}
}
