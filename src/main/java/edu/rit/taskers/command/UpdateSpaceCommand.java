package edu.rit.taskers.command;

/**
 * @author ian hunt
 * @date 11/4/11
 */

import edu.rit.taskers.model.Space;
import edu.rit.taskers.persistence.SpaceDao;

import java.util.Calendar;

public class UpdateSpaceCommand {


    private Space space;
    private SpaceDao spacedao;

    public UpdateSpaceCommand(Space space, SpaceDao spacedao) {
        this.space = space;
        this.spacedao = spacedao;
    }

    public void execute(){
        if(space.getId() != 0) {
            spacedao.update(space);
        }else {
            space.setCreated(Calendar.getInstance().getTime());
            spacedao.save(space);
        }
    }

}
