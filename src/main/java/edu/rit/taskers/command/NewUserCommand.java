package edu.rit.taskers.command;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import edu.rit.taskers.data.NewUser;
import edu.rit.taskers.model.Contact;
import edu.rit.taskers.model.User;
import edu.rit.taskers.persistence.ContactDao;
import edu.rit.taskers.persistence.UserDao;

/**
 * @author ian hunt
 * @date 11/4/11
 */
public class NewUserCommand {

    private NewUser newUser;

    @Autowired
    private UserDao userDao;

    @Autowired
    private ContactDao contactDao;

    public NewUserCommand(NewUser newUser) {
        this.newUser = newUser;
    }

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
	        System.out.println(contactDao);
	        contactDao.save(c);
	        u.setPrimaryContact( c );
	        userDao.save(u);
        }
    }

    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
