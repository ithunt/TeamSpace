package edu.rit.taskers.command;


import edu.rit.taskers.model.Actionable;
import edu.rit.taskers.model.Comment;
import edu.rit.taskers.persistence.CommentDao;

import java.util.Calendar;

/**
 * @author ian hunt
 */
public class UpdateCommentCommand {

    private Actionable actionable;
    private Comment comment;
    private CommentDao commentDao;

    public UpdateCommentCommand(Actionable actionable, Comment comment, CommentDao commentDao) {
        this.actionable = actionable;
        this.comment = comment;
        this.commentDao = commentDao;
    }

    public void execute() {

        if(comment.getId() != 0 ) {
            commentDao.update(this.comment);
        } else {
            this.comment.setCreated(Calendar.getInstance().getTime());
            this.comment.setItem(this.actionable.getId());
            commentDao.save(comment);
        }
    }

}
