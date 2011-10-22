package edu.rit.taskers.test;

import edu.rit.taskers.model.Actionable;
import edu.rit.taskers.model.Event;
import edu.rit.taskers.model.Task;
import edu.rit.taskers.persistence.EventDao;
import edu.rit.taskers.persistence.TaskDao;
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
 * @author ian
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-config.xml")
@TestExecutionListeners(listeners={DependencyInjectionTestExecutionListener.class})
@Transactional
public class EventTest {


    @Autowired
    private EventDao eventDao;

    @Test
    @Transactional
    public void testFindAll() {

        List<Event> eventList = eventDao.findAll();
        assertFalse(eventList.isEmpty());

        for(Actionable a : eventList) {
            System.out.println(a);
        }


    }





}
