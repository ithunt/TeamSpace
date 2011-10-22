package edu.rit.taskers.persistence;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.rit.taskers.model.Event;

/**
 * @author Ian Hunt
 */
@Repository
public class EventDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void save(Event event) {
        this.sessionFactory.getCurrentSession().save(event);
    }

    @SuppressWarnings("unchecked")
	@Transactional
    public List<Event> findAll() {
        return this.sessionFactory.getCurrentSession()
                .createQuery("FROM Actionable where TypeID = 2").list();
    }

    @Transactional
    public Event findById(int id) {
        return (Event) sessionFactory.getCurrentSession().get(Event.class, id);
    }

}
