package com.example.moscowcard.daos;

import com.example.store.config.HibernateSessionFactoryUtil;
import com.example.store.models.Spot;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SpotDao {
    public void save(Spot spot){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.save(spot);
        tr.commit();
        session.close();

    }
    public void update(Spot spot){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.update(spot);
        tr.commit();
        session.close();
    }
    public void delete(Spot spot) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tr = session.beginTransaction();
        session.delete(spot);
        tr.commit();
        session.close();
    }
    public List<Spot> getAll(){
        List<Spot> spotList = HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Spot").list();
        return  spotList;
    }

    public Spot findById(int id){
        return  HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Spot.class, id);
    }



}
