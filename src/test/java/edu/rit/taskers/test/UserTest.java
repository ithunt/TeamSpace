package edu.rit.taskers.test;

import edu.rit.taskers.model.User;
import edu.rit.taskers.persistence.UserDao;
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
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-config.xml")
@TestExecutionListeners(listeners={DependencyInjectionTestExecutionListener.class})
@Transactional
public class UserTest {


    @Autowired
    private UserDao userDao;

    @Test
    @Transactional
    public void testFindAll() {

        List<User> users = userDao.findAll();


        assertFalse(users.isEmpty());

        System.out.println(users.get(0));


    }





}
