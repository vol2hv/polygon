package com.example.polygon.hql;

import com.example.polygon.doman.Box;
import com.example.polygon.repository.BoxRepoQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class BoxRepoQueryImpl implements BoxRepoQuery {
    private EntityManager entityManager;


    public BoxRepoQueryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Autowired


//    Session session = entityManager.unwrap(Session.class);
    @Override
    public List<Box> getAll() {
        return entityManager.createQuery(
                "select b " + "from Box b", Box.class )
                .getResultList();
    }

    @Override
    public Box findByNameJpql(String name) {
        return (Box)entityManager.createQuery(
        "select b " +
                "from Box b " +
                "where b.name = :name")
                .setParameter("name",name)
                .getSingleResult();
    }

    @Override
    public Box findByNameHql(String name) {
        Session session = (Session) entityManager.getDelegate();
        return (Box)session.createQuery(
                "select b " +
                        "from Box b " +
                        "where b.name = :name")
                .setParameter("name",name)
                .getSingleResult();
    }
}