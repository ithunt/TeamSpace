package edu.rit.taskers.test;

import edu.rit.taskers.model.Task;
import edu.rit.taskers.persistence.TaskDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import static junit.framework.Assert.assertFalse;

/**
 * User: ddcihunt
 * Date: 10/12/11
 * Time: 7:27 PM
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/test-context.xml")
@TestExecutionListeners(listeners={DependencyInjectionTestExecutionListener.class})
public final class TaskTest {


    @Resource(name = "TaskDao")
    private TaskDao taskDao;

    @Test
    @Transactional
    public void testFindBySpace() {

        List<Task> taskList = taskDao.findBySpace(1);
        assertFalse(taskList.isEmpty());

        System.out.println(taskList.get(0));


    }





}
