package edu.rit.taskers.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.rit.taskers.model.User;
import edu.rit.taskers.persistence.SpaceDao;
import edu.rit.taskers.persistence.UserDao;

/**
 * Handles requests with space creation/listing/management.
 */
@Controller
@RequestMapping("/spaces")
public class SpaceController {

    @Autowired
    private SpaceDao spaceDao;
    
    @Autowired
    private UserDao userDao;

	private static final Logger logger = LoggerFactory.getLogger(SpaceController.class);

	/**
	 * Fetch all spaces visible to session user (spaces they have created + been invited to)
	 * @return Spaces
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getAvailableSpaces(Principal principal) {
		//TODO Account for more than one space (due to time constraints, for now
		//     we will assume a user/contact only belongs to one space).
		String username = principal.getName();
		System.out.println("In SpaceController, username is: " + username );
		ModelAndView spaces = new ModelAndView("spaces", "space", 
				userDao.findByUsername(username).getPrimaryContact().getSpace());
		return spaces;
	}
	
	/**
	 * User has selected a space, change DB and switch to home view
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String getContactDetails(@PathVariable int id, Principal principal) {
		String username = principal.getName();
		User tempUser = userDao.findByUsername(username);
		tempUser.setLastViewedSpace(id);
		userDao.update(tempUser);
		
		return "redirect:/";
	}

	/**
	 * Update the space details
	 * @return if Space was updated successfully
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public boolean updateSpace() {
		//TODO figure out if PUT is the best option
		return true;
	}
	
	/**
	 * Create a new space given details
	 * @return if Space was created successfully
	 */
	@RequestMapping(method = RequestMethod.POST)
	public boolean createSpace() {
		//TODO
		return true;
	}
}
