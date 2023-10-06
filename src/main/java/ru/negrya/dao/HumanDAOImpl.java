package ru.negrya.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.negrya.entity.Human;
import ru.negrya.utils.HibernateSessionFactoryUtil;

public class HumanDAOImpl implements HumanDAO {

    @Override
    public void create(Human human) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(human);
        tx1.commit();
        session.close();
    }

    @Override
    public Human read(int id) {
        final Human result = HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Human.class, id);
        return result != null ? result : new Human();
    }

    @Override
    public void update(Human human) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(human);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Human human) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(human);
        tx1.commit();
        session.close();
    }
}
