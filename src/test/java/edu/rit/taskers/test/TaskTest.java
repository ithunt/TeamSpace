package edu.rit.taskers.test;

import edu.rit.taskers.persistence.TaskDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

/**
 * User: ddcihunt
 * Date: 10/12/11
 * Time: 7:27 PM
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("")
@TestExecutionListeners({DependencyInjectionTestExecutionListener})
public final class TaskTest {



    @Autowired
    private TaskDao taskDao;



}
