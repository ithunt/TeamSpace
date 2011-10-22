package edu.rit.taskers.persistence;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.rit.taskers.model.Task;

@Repository
public class TaskDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public void save(Task task) {
        this.sessionFactory.getCurrentSession().save(task);
    }

    @SuppressWarnings("unchecked")
	@Transactional
    public List<Task> findBySpace(int spaceId) {
        return this.sessionFactory.getCurrentSession()
                .createQuery("FROM Actionable where Actionable.SpaceID=?")
                .setParameter(0, spaceId).list();
    }

    @Transactional
    public Task findById(int id) {
        return (Task)sessionFactory.getCurrentSession().get(Task.class, id);
    }

	@SuppressWarnings("unchecked")
	@Transactional
    public List<Task> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery("FROM Actionable").list();
    }
}
