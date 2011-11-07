package edu.rit.taskers.persistence;

import edu.rit.taskers.model.Contact;
import edu.rit.taskers.model.Event;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public Integer save(Event event) {
        return (Integer)this.sessionFactory.getCurrentSession().save(event);
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
                .createQuery("FROM Actionable WHERE SpaceID=? AND TypeID=2")
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


    @Transactional
    public List<Contact> findInvited(Event event) {
        return findInvited(event.getId());
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Contact> findInvited(Integer eventId) {
        return this.sessionFactory.getCurrentSession()
                .createSQLQuery("SELECT c.ContactID, c.UserID, c.Name, c.Phone, c.Email, c.Role, c.Bio, c.PictureURL, c.SpaceID " +
                        "FROM Contact c JOIN Invitation i ON c.ContactID = i.ContactID where i.EventID = ?")
                .addEntity("c", Contact.class).setParameter(0, eventId).list();
    }

    @Transactional
    public void addInvitees(Integer eventId, List<Integer> contactIds) {
        for(Integer id : contactIds) {
            this.sessionFactory.getCurrentSession().createSQLQuery("INSERT INTO Invitation (EventID, ContactID) VALUES (?,?)")
                    .setParameter(0, eventId).setParameter(1, id).executeUpdate();
        }
    }

    @Transactional
    public void clearInvitees(Integer eventId) {
        this.sessionFactory.getCurrentSession().createSQLQuery("DELETE FROM Invitation WHERE EventID = ?").setParameter(0, eventId).executeUpdate();
    }




}
