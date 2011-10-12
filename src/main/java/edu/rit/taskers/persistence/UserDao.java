package edu.rit.taskers.persistence;

import edu.rit.taskers.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: ddcihunt
 * Date: 10/12/11
 * Time: 12:55 PM
 */
@Repository("User")
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(User user) {
        this.sessionFactory.getCurrentSession().save(user);
    }

    public List<User> findAll() {
        sessionFactory.getCurrentSession();
        return this.sessionFactory.getCurrentSession().createQuery("FROM User").list();
    }



}
