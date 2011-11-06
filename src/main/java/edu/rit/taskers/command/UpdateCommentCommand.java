package edu.rit.taskers.command;


import edu.rit.taskers.model.Actionable;
import edu.rit.taskers.model.Comment;
import edu.rit.taskers.persistence.CommentDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdateCommentCommand {

    private Actionable actionable;
    private Comment comment;

    @Autowired
    private CommentDao commentDao;

    public UpdateCommentCommand(Comment comment,Actionable actionable){
        this.comment = comment;
        this.actionable = actionable;
    }

    public void execute(){

    }



}
