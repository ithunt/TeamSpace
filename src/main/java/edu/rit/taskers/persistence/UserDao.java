package edu.rit.taskers.persistence;

import edu.rit.taskers.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public Integer save(User user) {
        return (Integer)this.sessionFactory.getCurrentSession().save(user);
    }

    @Transactional
    public void update(User user) {
        this.sessionFactory.getCurrentSession().update(user);
    }

    @SuppressWarnings("unchecked")
	@Transactional
    public List<User> findAll() {
        sessionFactory.getCurrentSession();
        return this.sessionFactory.getCurrentSession().createQuery("FROM User").list();
    }

    @Transactional
    public User findById(int id) {
        return (User)sessionFactory.getCurrentSession().get(User.class, id);
    }
    
    @Transactional
    public User findByUsername(String username) {
    	return (User) this.sessionFactory.getCurrentSession()
    			.createQuery("FROM User WHERE LoginName=?")
    			.setParameter(0, username)
    			.uniqueResult();
    }
    
}
