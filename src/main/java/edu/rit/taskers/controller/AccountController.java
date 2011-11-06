package edu.rit.taskers.controller;

import edu.rit.taskers.persistence.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.rit.taskers.command.NewUserCommand;
import edu.rit.taskers.data.NewUser;
import edu.rit.taskers.model.Actionable;
import edu.rit.taskers.model.Task;
import edu.rit.taskers.model.User;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Handles requests with a user account.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/hello")
    public @ResponseBody String helloWorld() {
        return "Hello, World!";
    }

    @RequestMapping(value = "/one")
    public @ResponseBody User getUser() {
        return userDao.findAll().get(0);
    }

	/**
	 * Update the session user's account
	 * @return if Account was updated successfully
	 */
	@RequestMapping(method = RequestMethod.PUT)
	public boolean updateAccount() {
		//TODO figure out if PUT is the best option
		return true;
	}
	
	/**
	 * Create a new account given details
	 * @return if Account was created successfully
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String createNewTask(@RequestParam(value="login") String login,
			@RequestParam(value="password") String password,
			@RequestParam(value="name") String name,
			@RequestParam(value="phone") String phone,
			@RequestParam(value="email") String email,
			@RequestParam(value="role") String role,
			@RequestParam(value="bio") String bio,
			@RequestParam(value="pictureURL") String picutreURL){

			if ( isEmpty( username ) ) {
				return "Please specify a username.";
			} else if ( isEmpty( password ) ) {
				return "Please specify a password.";
			} else if ( isEmpty( email ) ) {
				return "Please specify your email.";
			} else if ( isEmpty( phone ) ) {
				return "Please specify your phone number.";
			}

			// Create the NewUser object and persist it
			NewUser newuser = new NewUser();
			newuser.setLogin(login);
			newuser.setPassword(password);
			newuser.setName(name);
			newuser.setEmail(email);
			newuser.setPhone(phone);
			newuser.setRole(role);
			newuser.setBio(bio);
			newuser.setPictureURL(pictureURL);
			
			NewUserCommand command = new NewUserCommand(newuser);
			
			command.execute();		
			return "User successfully created!"; 

		} catch (ParseException e) {
			e.printStackTrace();
			return "Invalid date specified.";
		}
	}
	
	/**
	 * Retrieve whether or not the requested account email is taken already
	 */
	@RequestMapping(value="/{email}", method=RequestMethod.GET)
	public @ResponseBody boolean isEmailAvailable(@RequestParam String email) {
		//TODO figure out email format validation location (probably client side)
		logger.info("Checking if email address is available [email:" + email + "]");

		//TODO
		return true;
	}
}
