package edu.rit.taskers.test;

import edu.rit.taskers.model.User;
import edu.rit.taskers.persistence.UserDao;
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
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
@TestExecutionListeners(listeners={DependencyInjectionTestExecutionListener.class})
public final class UserTest {


    @Resource(name = "UserDao")
    private UserDao userDao;

    @Test
    @Transactional
    public void testFindAll() {

        List<User> users = userDao.findAll();


        assertFalse(users.isEmpty());

        System.out.println(users.get(0));


    }





}
