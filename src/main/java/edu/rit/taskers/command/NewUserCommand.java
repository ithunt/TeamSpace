package edu.rit.taskers.command;

import edu.rit.taskers.data.NewUser;
import edu.rit.taskers.model.Contact;
import edu.rit.taskers.model.User;
import edu.rit.taskers.persistence.ContactDao;
import edu.rit.taskers.persistence.UserDao;

import java.util.Calendar;
import java.util.List;

/**
 * Handles logic related to new user creation
 * @author ian hunt
 * @date 11/4/11
 */
public class NewUserCommand {

    private NewUser newUser;
    private UserDao userDao;
    private ContactDao contactDao;

    public NewUserCommand(NewUser newUser, UserDao userDao, ContactDao contactDao) {
        this.newUser = newUser;
        this.userDao = userDao;
        this.contactDao = contactDao;
    }

    /**
     * Create User and Contact objects from NewUser
     * Contact become primaryContact of User
     */
    public void execute() {

        if(newUser == null) {
            System.err.println("NewUserCommand with null NewUser");
            
        } else {
	        Contact c = new Contact();
	        c.setName( newUser.getName() );
	        c.setEmail( newUser.getEmail() );
	        c.setPhone( newUser.getPhone() );
	
	        //Note these may be optional/configurable later
	        c.setBio( newUser.getBio() );
	        c.setPictureURL( newUser.getPictureURL() );
	
	        c.setRole( newUser.getRole() );
	
	        User u = new User();
	        u.setLogin( newUser.getLogin() );
	        u.setPassword( newUser.getPassword() );
	        u.setCreated( Calendar.getInstance().getTime() );
	        u.setRole("ROLE_USER");
	        Integer uid = userDao.save(u);

	        c.setUserId(uid);
	        contactDao.save(c);
	        
	        List<Contact> tempContact = contactDao.findByEmail(c.getEmail());
	        for(Contact s : tempContact) {
	        	u.setPrimaryContact(s);
	        	break; //TODO fix this, I'm assuming email is unique for now
	        }
	        userDao.update(u);
        }
    }

}
