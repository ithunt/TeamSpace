package edu.rit.taskers.command;

/**
 * @author ian hunt
 * @date 11/4/11
 */

import edu.rit.taskers.model.User;
import edu.rit.taskers.persistence.UserDao;

public class UpdateUserCommand {

    private User user;
    private UserDao userDao;


    public UpdateUserCommand(User user, UserDao userDao) {
        this.user = user;
        this.userDao = userDao;
    }

    public void execute() {

        if (user.getId() != 0) {
            userDao.update(user);
        }

        //Note: new users use new user command
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
