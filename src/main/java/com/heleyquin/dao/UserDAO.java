package com.heleyquin.dao;

import com.heleyquin.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UserDAO {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em;

    public void insertUser(User user) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }

    public User getUserDetail(int id) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        User user = em.find(User.class, id);
        em.getTransaction().commit();
        em.close();
        return user;
    }

    public List<User> getUsers() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<User> list = em.createQuery("select u from User u", User.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }
}
