package edu.rit.taskers.command;

/**
 * @author ian hunt
 * @date 11/4/11
 */

import edu.rit.taskers.model.Space;
import edu.rit.taskers.persistence.SpaceDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;

public class UpdateSpaceCommand {
    private Space space;

    @Autowired
    private SpaceDao spacedao;

    public UpdateSpaceCommand(Space space){
        this.space = space;
    }


    public void execute(){
        if(space.getId() != 0) {
            spacedao.update(space);
        }else {
            space.setCreated(Calendar.getInstance().getTime());
            spacedao.save(space);
        }
    }

    public void setSpacedao(SpaceDao spacedao) {
        this.spacedao = spacedao;
    }
}
