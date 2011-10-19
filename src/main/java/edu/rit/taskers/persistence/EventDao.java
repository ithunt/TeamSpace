package edu.rit.taskers.persistence;

import edu.rit.taskers.model.Event;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Ian Hunt
 */
@Repository
public class EventDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void save(Event event) {
        this.sessionFactory.getCurrentSession().save(event);
    }

    @Transactional
    public List<Event> findAll() {
        return this.sessionFactory.getCurrentSession()
                .createQuery("FROM Event").list();
    }

}
