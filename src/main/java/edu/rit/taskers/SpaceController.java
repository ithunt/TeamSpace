package edu.rit.taskers;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.rit.taskers.model.Space;

/**
 * Handles requests with space creation/listing/management.
 */
@Controller
@RequestMapping("/space")
public class SpaceController {

	private static final Logger logger = LoggerFactory.getLogger(SpaceController.class);

	/**
	 * Fetch all spaces visible to session user (spaces they have created + been invited to)
	 * @return Spaces
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ArrayList<Space> getAvailableSpaces() {
		//TODO - with session authentication
		return null;
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
