package edu.rit.taskers.persistence;

import edu.rit.taskers.model.Comment;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ian hunt
 * @date 11/6/11
 */
@Repository
public class CommentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public Integer save(Comment comment) {
        return (Integer)this.sessionFactory.getCurrentSession().save(comment);
    }

    @Transactional
    public void update(Comment comment) {
        this.sessionFactory.getCurrentSession().update(comment);
    }

    @Transactional
    public void delete(Comment comment) {
        this.sessionFactory.getCurrentSession().delete(comment);
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Comment> findByActionable(int actionableId) {
        return this.sessionFactory.getCurrentSession()
                .createQuery("FROM Comment WHERE ItemID=?")
                .setParameter(0, actionableId)
                .list();
    }

    @Transactional
    public Comment findById(int id) {
        return (Comment)sessionFactory.getCurrentSession().get(Comment.class, id);

    }



}
