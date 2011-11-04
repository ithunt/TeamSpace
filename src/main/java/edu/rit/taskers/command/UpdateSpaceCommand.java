package edu.rit.taskers.command;

/**
 * @author ian hunt
 * @date 11/4/11
 */

import edu.rit.taskers.model.Space;
import org.springframework.beans.factory.annotation.Autowired;
import edu.rit.taskers.persistence.SpaceDao;

public class UpdateSpaceCommand {
    private Space space;

    @Autowired
    private SpaceDao spacedao;

    public UpdateSpaceCommand(Space space){
        this.space = space;
    }


    public void execute(){
        spacedao.save(space);
    }

}
