package edu.rit.taskers.controller;

import edu.rit.taskers.command.UpdateCommentCommand;
import edu.rit.taskers.model.Comment;
import edu.rit.taskers.model.Contact;
import edu.rit.taskers.persistence.CommentDao;
import edu.rit.taskers.persistence.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * Handles requests with space creation/listing/management.
 */
@Controller
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentDao commentDao;
    
    @Autowired
    private UserDao userDao;

	private static final Logger logger = LoggerFactory.getLogger(CommentController.class);
	
	/**
	 * Return information on a specific comment.
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public String getContactDetails(@PathVariable int id, Principal principal) {
		String username = principal.getName();
		Comment tempComment = commentDao.findById(id);
		
		//TODO - Hook into a JSP.
		return tempComment.toString();
	}

	/**
	 * Update a comment given details.  
	 * @return if the comment was updated successfully
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.POST)
	public @ResponseBody String updateComment(Principal principal,
								 @PathVariable int id,
			                     @RequestParam(value="text") String text,
								 @RequestParam(value="item") int itemId) {
			
			String username = principal.getName();
			
			Contact editor = userDao.findByUsername(username).getPrimaryContact();
			Comment tempComment = commentDao.findById(id);
			
			if ( editor.getId() != tempComment.getCreator().getId() ) {
				return "You must be the creator of a comment to edit it!";
			}
			
			if ( isEmpty(text) ) {
				return "Please provide some content for the comment.";
			} else if ( itemId == 0 ) {
				return "Missing item (task or event) to attach comment to.";
			}

			Comment newComment = new Comment();
			newComment.setText(text);
			newComment.setItem(itemId);

			UpdateCommentCommand command =  new UpdateCommentCommand(newComment, commentDao);
			
			command.execute();			
			return "Command successfully created!"; 
	}
	
	/**
	 * Create a new comment given details.  
	 * @return if the comment was created successfully
	 */
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public @ResponseBody String createComment(Principal principal,
			                     @RequestParam(value="text") String text,
								 @RequestParam(value="item") int itemId) {
			
			String username = principal.getName();
			
			Contact creator = userDao.findByUsername(username).getPrimaryContact();
			
			if ( isEmpty(text) ) {
				return "Please provide some content for the comment.";
			} else if ( itemId == 0 ) {
				return "Missing item (task or event) to attach comment to.";
			}

			Comment newComment = new Comment();
			newComment.setText(text);
			newComment.setItem(itemId);
			newComment.setCreator(creator);
			
			UpdateCommentCommand command =  new UpdateCommentCommand(newComment, commentDao);
			
			command.execute();			
			return "Command successfully created!"; 
	}

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id, Principal principal) {

        Comment c = commentDao.findById(id);

        if(userDao.findByUsername(principal.getName()).getPrimaryContact().getId() !=
                c.getCreator().getId()) {
            return "Only Creator Can Delete.";
        }

        commentDao.delete(c);
        return "deleted comment";
    }
	
	/**
	 * String isEmpty helper method
	 */
	private boolean isEmpty(String s) {
		return ( s == null ) || ( "".equals(s) ) || ( s.length() == 0 );
	}
}
