package edu.rit.taskers.persistence;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.rit.taskers.model.Contact;

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
    public Integer save(Contact contact) {
        return (Integer)this.sessionFactory.getCurrentSession().save(contact);
    }

    @Transactional
    public void update(Contact contact) {
        this.sessionFactory.getCurrentSession().update(contact);
    }

    @Transactional
    public void delete(Contact contact) {
        this.sessionFactory.getCurrentSession().delete(contact);
    }

    @SuppressWarnings("unchecked")
	@Transactional
    public List<Contact> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery("FROM Contact").list();
    }

    @Transactional
    public Contact findById(int id) {
        return (Contact) sessionFactory.getCurrentSession().get(Contact.class, id);
    }

    @SuppressWarnings("unchecked")
	@Transactional
    public List<Contact> findByEmail(String email) {
        sessionFactory.getCurrentSession();
        return this.sessionFactory.getCurrentSession()
        		.createQuery("FROM Contact WHERE Email=?")
                .setParameter(0, email).list();
    }
    
    @SuppressWarnings("unchecked")
    @Transactional    
    public List<Contact> findBySpace(int id) {
        sessionFactory.getCurrentSession();
        return this.sessionFactory.getCurrentSession()
        		.createQuery("FROM Contact WHERE SpaceID=?")
                .setParameter(0, id).list();
    }
}
