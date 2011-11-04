package edu.rit.taskers.command;

import edu.rit.taskers.data.NewUser;
import edu.rit.taskers.model.Contact;
import edu.rit.taskers.model.User;
import edu.rit.taskers.persistence.ContactDao;
import edu.rit.taskers.persistence.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

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

        Contact c = new Contact();
        c.setFirstName(newUser.getName());
        c.setEmail( newUser.getEmail() );
        c.setPhone( newUser.getPhone() );

        //Note these may be optional/configurable later
        c.setBio( newUser.getBio() );
        c.setPictureURL( newUser.getPictureURL() );

        c.setRole( "ROLE_USER");

        User u = new User();
        u.setLogin( newUser.getLogin() );
        u.setPassword( newUser.getPassword() );

        u.setPrimaryContact( c );

        contactDao.save(c);
        userDao.save(u);
    }

}
