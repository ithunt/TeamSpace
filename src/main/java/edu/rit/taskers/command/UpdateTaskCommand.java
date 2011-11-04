package edu.rit.taskers.command;

/**
 * @author ian hunt
 * @date 11/4/11
 */

import edu.rit.taskers.model.Task;
import edu.rit.taskers.persistence.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;


public class UpdateTaskCommand{

    private Task task;

    @Autowired
    private TaskDao taskdao;

    public UpdateTaskCommand(Task task){
        this.task = task;
    }

    public void execute() {

        //TODO: task.setCreator( )
        task.setCreated(Calendar.getInstance().getTime());

        if(task.getId() != 0) {
            taskdao.update(task);
        } else {
            taskdao.save(task);
        }

    }
}
