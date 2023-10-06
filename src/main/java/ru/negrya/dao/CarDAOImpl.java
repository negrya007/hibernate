package ru.negrya.dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.negrya.entity.Car;
import ru.negrya.utils.HibernateSessionFactoryUtil;

public class CarDAOImpl implements CarDAO{

    @Override
    public void create(Car car) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(car);
        tx1.commit();
        session.close();
    }

    @Override
    public Car read(int id) {
            final Car result = HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Car.class, id);
            if (result != null) {
                Hibernate.initialize(result.getEngine());
                return result;
            } else {
                return null;
            }
    }

    @Override
    public void update(Car car) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(car);
        tx1.commit();
        session.close();
    }

    @Override
    public void delete(Car car) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(car);
        tx1.commit();
        session.close();
    }
}
