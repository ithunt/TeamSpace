package edu.rit.taskers.persistence;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.rit.taskers.model.User;

/**
 * @author ian hunt
 */
@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void save(User user) {
        this.sessionFactory.getCurrentSession().save(user);
    }

    @SuppressWarnings("unchecked")
	@Transactional
    public List<User> findAll() {
        sessionFactory.getCurrentSession();
        return this.sessionFactory.getCurrentSession().createQuery("FROM User").list();
    }

    @Transactional
    public User findById(int id) {
        return (User) sessionFactory.getCurrentSession().get(User.class, id);
    }
    
}
