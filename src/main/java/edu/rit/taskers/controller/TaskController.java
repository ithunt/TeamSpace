package edu.rit.taskers.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.rit.taskers.persistence.TaskDao;

/**
 * Handles requests with a space related to tasks.
 */
@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskDao taskDao;

	private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

	/**
	 * Fetch all tasks that belong to session space id
	 * @return Collection of events
	 */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getAllTasks() {
		//TODO - Session space ID
		ModelAndView eventsMainPage = new ModelAndView("tasks", "alltasks", taskDao.findAll());
		return eventsMainPage;
	}

	/**
	 * Retrieve the tasks details from a selected task in the list
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ModelAndView getEventDetails(@PathVariable int id) {
		ModelAndView taskDetailsEditPage = new ModelAndView("edittask", "task", taskDao.findById(id));
		return taskDetailsEditPage;
	}

	/**
	 * Create New Task page requested
	 */
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public ModelAndView getCreateEventPage() {
		ModelAndView newTaskPage = new ModelAndView("newtask");
		return newTaskPage;
	}
}
