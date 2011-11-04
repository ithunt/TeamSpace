package edu.rit.taskers.persistence;

import edu.rit.taskers.model.Contact;
import edu.rit.taskers.model.Task;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author acb
 */
@Repository
public class ContactDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void save(Contact contact) {
        this.sessionFactory.getCurrentSession().save(contact);
    }

    @Transactional
    public void update(Contact contact) {
        this.sessionFactory.getCurrentSession().update(contact);
    }

    @SuppressWarnings("unchecked")
	@Transactional
    public List<Contact> findAll() {
        sessionFactory.getCurrentSession();
        return this.sessionFactory.getCurrentSession().createQuery("FROM Contact").list();
    }

    @Transactional
    public Contact findById(int id) {
        return (Contact) sessionFactory.getCurrentSession().get(Contact.class, id);
    }
    
    @SuppressWarnings("unchecked")
    @Transactional    
    public List<Contact> findBySpace(int id) {
        sessionFactory.getCurrentSession();
        return this.sessionFactory.getCurrentSession()
        		.createQuery("FROM Contact WHERE SpaceID=?").list();
    }
}
