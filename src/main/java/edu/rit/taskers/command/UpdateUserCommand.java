package edu.rit.taskers.command;

/**
 * @author ian hunt
 * @date 11/4/11
 */

import edu.rit.taskers.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import edu.rit.taskers.persistence.UserDao;
public class UpdateUserCommand{

    private User user;

    @Autowired
    private UserDao userdao;


    public UpdateUserCommand(User user){
        this.user = user;
    }

    public void execute(){
        userdao.save(user);
    }

}
