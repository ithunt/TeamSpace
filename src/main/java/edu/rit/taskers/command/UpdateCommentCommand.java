package edu.rit.taskers.command;


import edu.rit.taskers.model.Actionable;
import edu.rit.taskers.model.Comment;
import edu.rit.taskers.persistence.CommentDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;

/**
 * @author ian hunt, nsama chipalo
 */
public class UpdateCommentCommand {

    private Actionable actionable;
    private Comment comment;

    @Autowired
    private CommentDao commentDao;

    public UpdateCommentCommand(Comment comment,Actionable actionable){
        this.comment = comment;
        this.actionable = actionable;
    }

    public void execute() {

        if(comment.getId() != 0 ) {
            commentDao.update(this.comment);
        } else {
            this.comment.setCreated(Calendar.getInstance().getTime());
            this.comment.setItem(this.actionable);
            commentDao.save(comment);
        }
    }

    public void setCommentDao(CommentDao commentDao) {
        this.commentDao = commentDao;
    }
}
