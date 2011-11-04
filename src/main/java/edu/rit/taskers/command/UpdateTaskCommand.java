package edu.rit.taskers.command;

/**
 * @author ian hunt
 * @date 11/4/11
 */

import edu.rit.taskers.model.Task;
import edu.rit.taskers.persistence.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;


public class UpdateTaskCommand{

    private Task task;

    @Autowired
    private TaskDao taskdao;

    public UpdateTaskCommand(Task task){
        this.task = task;
    }

    public void execute(){
        taskdao.update(task);
    }
}
