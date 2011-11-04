package edu.rit.taskers.command;

import java.util.List;

import edu.rit.taskers.persistence.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import edu.rit.taskers.model.User;


public class CreateAccountCommand implements Command<User> {	
	public CreateAccountCommand() {
		//Need Better Understanding of how POST works with spring 3.  Something about @BodyRequest mapping to a bean.
		
	}
	public List<User> execute() throws CommandFailure {
		return null;
	}
}
