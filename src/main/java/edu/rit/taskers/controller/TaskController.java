package edu.rit.taskers.controller;

import edu.rit.taskers.command.UpdateTaskCommand;
import edu.rit.taskers.model.Actionable;
import edu.rit.taskers.model.Task;
import edu.rit.taskers.persistence.TaskDao;
import edu.rit.taskers.persistence.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Handles requests with a space related to tasks.
 */
@Controller
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskDao taskDao;

    @Autowired
    private UserDao userDao;

	private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

	/**
	 * Fetch all tasks that belong to session space id
	 */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getSpaceTasks(@CookieValue("SPACE") int spaceId) {
		
		ModelAndView tasksMainPage = new ModelAndView("tasks", "alltasks", taskDao.findBySpace(spaceId));
		return tasksMainPage;
	}

	/**
	 * Retrieve the task details from a selected task in the list
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ModelAndView getTaskDetails(@PathVariable int id) {
		ModelAndView taskEditPage = new ModelAndView("edittask", "task", taskDao.findById(id));
		return taskEditPage;
	}

	/**
	 * Delete a task by id
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public String delete(@PathVariable int id, Principal principal) {
		Task retrievedTask = taskDao.findById(id);

        if(userDao.findByUsername(principal.getName()).getPrimaryContact().getId() !=
                retrievedTask.getCreator().getId()) {
            return "Only Creator Can Delete.";
        }
		taskDao.delete(retrievedTask);
		return "redirect:/tasks";
	}

	/**
	 * Update tasks details from a selected task in the list
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.POST)
	public @ResponseBody String updateTask(@PathVariable int id, @RequestParam(value="title") String taskName,
								 @RequestParam(value="targetdate") String targetDate,
								 @RequestParam(value="priority") String priority,
								 @RequestParam(value="description") String desc) {
		
		try {
			DateFormat df = new SimpleDateFormat(Actionable.ACTION_UI_DATEFORMAT);
			
			if ( isEmpty( taskName ) ) {
				return "Please specify a title.";
			} else if ( targetDate == null ) {
				return "Please specify a date.";
			}
	
			// Create the new task object and persist it
			Task fetchedTask = taskDao.findById(id);
			fetchedTask.setName(taskName);
			fetchedTask.setTargetDate(df.parse(targetDate));
			fetchedTask.setPriority(priority);
			fetchedTask.setDescription(desc);

            UpdateTaskCommand cmd = new UpdateTaskCommand(fetchedTask, taskDao);
            cmd.execute();

			return "success";
			
		} catch (ParseException e) {
			e.printStackTrace();
			return "Invalid date specified.";
		}
	}

	/**
	 * Create New Task page requested
	 */
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public ModelAndView getCreateTaskPage() {
		ModelAndView newTaskPage = new ModelAndView("newtask");
		return newTaskPage;
	}

	/**
	 * Create New Task from js function with form data parameters
	 */
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public @ResponseBody String createNewTask(Principal principal,
                                 @RequestParam(value="title") String taskName,
								 @RequestParam(value="targetdate") String targetDate,
								 @RequestParam(value="priority") String priority,
								 @RequestParam(value="description") String desc,
                                 @CookieValue("SPACE") int spaceId) {
		try {
			DateFormat df = new SimpleDateFormat(Actionable.ACTION_UI_DATEFORMAT);
			
			if ( isEmpty( taskName ) ) {
				return "Please specify a title.";
			} else if ( isEmpty( targetDate ) ) {
				return "Please specify a date.";
			}
	
			// Create the new task object and persist it
			Task newTask = new Task();
			newTask.setName(taskName);
			newTask.setTargetDate(df.parse(targetDate));
			newTask.setPriority(priority);
			newTask.setDescription(desc);
            newTask.setSpaceId(spaceId);
            newTask.setCreator( userDao.findByUsername(principal.getName()).getPrimaryContact() );

            UpdateTaskCommand command = new UpdateTaskCommand(newTask, taskDao);

            command.execute();
	
			//taskDao.save( newTask );
			return "success"; 
			
		} catch (ParseException e) {
			e.printStackTrace();
			return "Invalid date specified.";
		}
	}
	
	/**
	 * Retrieve comments for a given task
	 */
	@RequestMapping(value="/{id}/comments", method=RequestMethod.GET)
	public String getTaskComments(@PathVariable int id) {
		taskDao.findById(id).getComments(); //Use this for whatever we're returning.
		
		//TODO - Hook into JSP?
		//ModelAndView taskEditPage = new ModelAndView("edittask", "task", taskDao.findById(id));
		//return taskEditPage;
		return "TBD";
	}

	/**
	 * String isEmpty helper method
	 */
	private boolean isEmpty(String s) {
		return ( s == null ) || ( "".equals(s) ) || ( s.length() == 0 );
	}
}
