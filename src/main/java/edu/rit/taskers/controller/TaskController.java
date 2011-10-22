package edu.rit.taskers.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.rit.taskers.model.Task;
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
	 * @return Collection of tasks
	 */
	@RequestMapping(method = RequestMethod.GET)
    public ModelAndView getAllTasks() {
		//TODO
		ModelAndView test = new ModelAndView("tasks");
		return test;
	}

	/**
	 * Retrieve the task details from a selected task in the list
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public @ResponseBody Task getEventDetails(@PathVariable int id) {
		logger.info("Retrieving task details [ID:" + id + "]");

		//TODO
		Task returnTask = null;

		return returnTask;
	}

	/**
	 * Create New Task page requested
	 */
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public ModelAndView getCreateEventPage() {
		ModelAndView newTaskPage = new ModelAndView("newTask");
		return newTaskPage;
	}
}
