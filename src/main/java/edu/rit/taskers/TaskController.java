package edu.rit.taskers;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import edu.rit.taskers.model.Task;

/**
 * Handles requests with a space related to tasks.
 */
@Controller
@RequestMapping("/tasks")
public class TaskController {

	private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

	/**
	 * Fetch all tasks that belong to session space id
	 * @return Collection of tasks
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ArrayList<Task> getAllTasks() {
		//TODO
		return null;
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
}
