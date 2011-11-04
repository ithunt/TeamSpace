package edu.rit.taskers.controller;

import edu.rit.taskers.model.Space;
import edu.rit.taskers.model.User;
import edu.rit.taskers.persistence.SpaceDao;
import edu.rit.taskers.persistence.UserDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.rit.taskers.command.UpdateSpaceCommand;

import java.security.Principal;
import java.util.ArrayList;

/**
 * Handles requests with space creation/listing/management.
 */
@Controller
@RequestMapping("/space")
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
	public ArrayList<Space> getAvailableSpaces(Principal principal) {
		//XXX - For now, users only belong to one space.
		String username = principal.getName();
		Space space = userDao.findByUsername(username).getPrimaryContact().getSpace();
		ArrayList<Space> returnable = new ArrayList<Space>();
		returnable.add(space);
		return returnable;
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
