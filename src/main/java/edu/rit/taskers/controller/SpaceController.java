package edu.rit.taskers.controller;

import edu.rit.taskers.command.UpdateSpaceCommand;
import edu.rit.taskers.model.Contact;
import edu.rit.taskers.model.Space;
import edu.rit.taskers.model.User;
import edu.rit.taskers.persistence.ContactDao;
import edu.rit.taskers.persistence.SpaceDao;
import edu.rit.taskers.persistence.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

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
    
    @Autowired
    private ContactDao contactDao;

	private static final Logger logger = LoggerFactory.getLogger(SpaceController.class);

	/**
	 * Fetch all spaces.  Period.  Return as a jsp.
	 * @return Spaces
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getAvailableSpaces(Principal principal) {
		//TODO Account for more than one space (due to time constraints, for now
		//     we will assume a user/contact only belongs to one space).
		String username = principal.getName();
		ModelAndView spaces = new ModelAndView("spaces", "spaces", 
				spaceDao.findAll());
		return spaces;
	}

	/**
	 * Create New Space page requested
	 */
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public ModelAndView getCreateSpacePage() {
		ModelAndView newSpacePage = new ModelAndView("newspace");
		return newSpacePage;
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
		Contact tempContact = tempUser.getPrimaryContact();
		tempContact.setSpaceId(id);
		contactDao.update(tempContact);
		
		return "redirect:/";
	}

	/**
	 * Update the space details
	 * @return if Space was updated successfully
	 */
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public String updateSpace(@PathVariable int id, 
			 @RequestParam(value="name") String spaceName,
			 @RequestParam(value="description") String desc) {
		
		//TODO - Security Check
		
		if ( isEmpty(spaceName) ) {
			return "Please provide a spacename.";
		} else if ( isEmpty(desc) ) {
			return "Please provide a description.";
		}
		
		Space tempSpace = spaceDao.findById(id);
		tempSpace.setName(spaceName);
		tempSpace.setDescription(desc);
		
		UpdateSpaceCommand command = new UpdateSpaceCommand(tempSpace, spaceDao);
		
		command.execute();
		return "success";
	}
	
	/**
	 * Create a new space given details.  
	 * @return if Space was created successfully
	 */
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public @ResponseBody String createSpace(Principal principal,
			                     @RequestParam(value="title") String spaceName,
								 @RequestParam(value="description") String desc) {
			
			String username = principal.getName();
			
			Contact creator = userDao.findByUsername(username).getPrimaryContact();
			
			if ( isEmpty(spaceName) ) {
				return "Please provide a name.";
			} else if ( isEmpty(desc) ) {
				return "Please provide a description.";
			}
	
			// Create the new task object and persist it
			Space newSpace = new Space();
			newSpace.setName(spaceName);
			newSpace.setDescription(desc);
			newSpace.setCreator(creator);
			
			UpdateSpaceCommand command =  new UpdateSpaceCommand(newSpace, spaceDao);
			
			command.execute();			
			return "success"; 
	}

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
        Space s = spaceDao.findById(id);
        spaceDao.delete(s);
        return "redirect:/";
    }
	
	/**
	 * String isEmpty helper method
	 */
	private boolean isEmpty(String s) {
		return ( s == null ) || ( "".equals(s) ) || ( s.length() == 0 );
	}
}
