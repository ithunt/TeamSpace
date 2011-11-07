package edu.rit.taskers.controller;

import java.security.Principal;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.rit.taskers.persistence.SpaceDao;
import edu.rit.taskers.persistence.UserDao;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    
    @Autowired
    private UserDao userDao;
    
    @Autowired
    private SpaceDao spaceDao;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String goHome(HttpServletResponse response, Model m, Principal principal) {
        String username = principal.getName();

        principal.getName();

        Integer lastViewedId = userDao.findByUsername(username).getLastViewedSpace();

        if (lastViewedId != null) {
        	response.addCookie(new Cookie("SPACE", lastViewedId + ""));
        	m.addAttribute("username", username);
        	m.addAttribute("spacename", spaceDao.findById(lastViewedId).getName());
    		return "home";
        } else {
        	return "redirect:/spaces";
        }
	}
	
}
