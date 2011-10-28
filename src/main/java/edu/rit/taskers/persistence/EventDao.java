package edu.rit.taskers.persistence;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.rit.taskers.model.Event;

/**
 * @author Ian Hunt, Anthony Barone
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

    @Transactional
    public void update(Event event) {
        this.sessionFactory.getCurrentSession().update(event);
    }

    @Transactional
    public void delete(Event event) {
        this.sessionFactory.getCurrentSession().delete(event);
    }

    @SuppressWarnings("unchecked")
	@Transactional
    public List<Event> findBySpace(int spaceId) {
        return this.sessionFactory.getCurrentSession()
                .createQuery("FROM Actionable WHERE Actionable.SpaceID=? AND TypeID=2")
                .setParameter(0, spaceId).list();
    }

    @Transactional
    public Event findById(int id) {
        return (Event) sessionFactory.getCurrentSession().get(Event.class, id);
    }

    @SuppressWarnings("unchecked")
	@Transactional
    public List<Event> findAll() {
        return this.sessionFactory.getCurrentSession()
                .createQuery("FROM Actionable WHERE TypeID=2").list();
    }

}
