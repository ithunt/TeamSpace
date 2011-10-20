package edu.rit.taskers.test;

import edu.rit.taskers.model.Space;
import edu.rit.taskers.persistence.SpaceDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static junit.framework.Assert.assertFalse;

/**
 * @author ian hunt
 * @date ${date}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-config.xml")
@TestExecutionListeners(listeners={DependencyInjectionTestExecutionListener.class})
@Transactional
public class SpaceTest {


    @Autowired
    private SpaceDao spaceDao;

    @Test
    @Transactional
    public void testFindAll() {


        List<Space> spaceList = spaceDao.findAll();
        assertFalse(spaceList.isEmpty());

        for(Space space : spaceList) {
            System.out.println(spaceList.toString());
        }

    }

}
