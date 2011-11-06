package edu.rit.taskers.command;

/**
 * User: Nsama
 * Date: 11/4/11
 */
import org.springframework.beans.factory.annotation.Autowired;

import edu.rit.taskers.model.Contact;
import edu.rit.taskers.persistence.ContactDao;
public class UpdateContactCommand {
	
	@Autowired
	private ContactDao contactDao;

    private Contact contact;

    public UpdateContactCommand(Contact contact){
        this.contact = contact;
    }

    public void execute() {
    	if(contact.getId() != 0){
            contactDao.update(contact);
        }else{
        	contactDao.save(contact);
        }
    }

}

