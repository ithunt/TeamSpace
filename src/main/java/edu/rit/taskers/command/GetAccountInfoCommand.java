package edu.rit.taskers.command;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.rit.taskers.model.User;
import edu.rit.taskers.persistence.UserDao;

public class GetAccountInfoCommand implements Command<User> {
	
	@Autowired
	private UserDao userDao; 

	public List<User> execute() throws CommandFailure {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
