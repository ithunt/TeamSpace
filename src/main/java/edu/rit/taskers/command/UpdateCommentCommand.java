package edu.rit.taskers.command;

/**
 * Created by IntelliJ IDEA.
 * User: Nsama
 * Date: 11/4/11
 */

import edu.rit.taskers.model.Comment;
import edu.rit.taskers.model.Actionable;
public class UpdateCommentCommand {

    private Actionable actionable;
    private Comment comment;

    public UpdateCommentCommand(Comment comment,Actionable actionable){
        this.comment = comment;
        this.actionable = actionable;

    }

    public void execute(){

    }



}
