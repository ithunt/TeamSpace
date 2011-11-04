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

import edu.rit.taskers.model.User;

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
	public boolean createAccount(@RequestBody MultiValueMap<String,String> request) {
		//TODO
		return true;
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
