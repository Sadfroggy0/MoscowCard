package com.example.moscowcard.daos;

import com.example.store.config.HibernateSessionFactoryUtil;
import com.example.store.models.Excursion;
import com.example.store.models.Spot;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ExcursionDao {
    public void save(Excursion excursion){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.save(excursion);
        tr.commit();
        session.close();

    }
    public void update(Excursion excursion){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.update(excursion);
        tr.commit();
        session.close();
    }
    public void delete(Excursion excursion) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.delete(excursion);
        tr.commit();
        session.close();
    }
    public List<Excursion> getAll(){
        List<Excursion> excursionList = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Excursion ").list();
        return excursionList ;
    }

    public Spot findById(int id){
        return  HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Spot.class, id);
    }
}

