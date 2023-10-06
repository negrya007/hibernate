package ru.negrya.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.negrya.entity.Engine;
import ru.negrya.utils.HibernateSessionFactoryUtil;

public class EngineDAOImpl implements EngineDAO{

    @Override
    public void create(Engine engine) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(engine);
        tx1.commit();
        session.close();
    }

    @Override
    public Engine read(String model) {
            final Engine result =HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Engine.class, model);
            return result != null ? result: new Engine();

    }

    @Override
    public void update(Engine engine) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(engine);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Engine engine) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(engine);
        tx1.commit();
        session.close();
    }
}
