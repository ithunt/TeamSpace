package edu.rit.taskers.persistence;

import edu.rit.taskers.model.Space;
import edu.rit.taskers.model.Task;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TaskDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(Task task) {
        this.sessionFactory.getCurrentSession().save(task);
    }

    @Transactional
    public List findBySpace(int spaceId) {
        return this.sessionFactory.getCurrentSession()
                .createQuery("FROM Task where Task.SpaceID=?")
                .setParameter(0, spaceId).list();
    }

    @Transactional
    public Task findById(int id) {
        return (Task)sessionFactory.getCurrentSession().get(Task.class, id);
    }

    @Transactional
    public List<Task> findBySpace(Space space) {
        //return findBySpace(space.getId());
        return null;
    }

    @Transactional
    public List<Task> findAll() {
        return this.sessionFactory.getCurrentSession()
                .createQuery("FROM Task").list();
    }
}