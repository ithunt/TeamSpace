package edu.rit.taskers.command;

/**
 * @author ian hunt
 * @date 11/4/11
 */

import edu.rit.taskers.model.Task;
import edu.rit.taskers.persistence.TaskDao;

import java.util.Calendar;


public class UpdateTaskCommand{

    private Task task;
    private TaskDao taskdao;

    public UpdateTaskCommand(Task task, TaskDao taskdao) {
        this.task = task;
        this.taskdao = taskdao;
    }

    public void execute() {
        if(task.getId() != 0) {
            taskdao.update(task);
        } else {
            task.setCreated(Calendar.getInstance().getTime());
            taskdao.save(task);
        }
    }

}
