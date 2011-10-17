package edu.rit.taskers;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.codehaus.jackson.map.ObjectMapper;

import edu.rit.taskers.model.Contact;
import edu.rit.taskers.model.User;

/**
 * Handles requests for a user.  A "user" is the primary contact card of an
 * account.
 */
@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	/**
	 * Selects and returns the primary contact of a user account.
	 */
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable int userID) {
		logger.info("Getting user " + userID);
		
		User returnable = new User("testuser",
				new Contact("Chuck", "330-612-9207",
				"chucknorris@chucknorrisisawesome.com", "Badass",
				"When Chuck was born, he roundhouse kicked the doctor in the face.  The Rest, as they say, is history.",
				null), new ArrayList<Contact>());
		
		//Query System, get primary card.
		  
		return returnable;
	}
	


	public static void main(String[] args) {
		System.out.println("Check");
		UserController cont = new UserController();
		System.out.println(cont.getUser(0));
	}
}

