package edu.rit.taskers.persistence;

import edu.rit.taskers.model.Space;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ian hunt
 * @date 10.20.2011
 */
@Repository
public class SpaceDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void save(Space space) {
        this.sessionFactory.getCurrentSession().save(space);
    }

    @Transactional
    public void update(Space space) {
        this.sessionFactory.getCurrentSession().update(space);
    }

    @SuppressWarnings("unchecked")
	@Transactional
    public List<Space> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery("FROM Space").list();

    }

    @Transactional
    public Space findById(int id) {
        return (Space) sessionFactory.getCurrentSession().get(Space.class, id);
    }

    @Transactional
    public Space findByName(String name) {
        return (Space) sessionFactory.getCurrentSession()
                .createQuery("FROM Space WHERE Name=?")
                .setParameter(0, name);
    }

}
