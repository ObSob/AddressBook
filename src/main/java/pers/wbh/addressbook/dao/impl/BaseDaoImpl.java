package pers.wbh.addressbook.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pers.wbh.addressbook.dao.BaseDao;

@Repository("baseDao")
@Transactional
public class BaseDaoImpl<T> implements BaseDao<T> {
    @Autowired
    private SessionFactory sessionFactory;

    public Session getCurrentSessionFactory() {
        return sessionFactory.getCurrentSession();
    }

    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public void save(T entity) {
        this.getCurrentSessionFactory().save(entity);
    }

    public void update(T entity) {
        this.getCurrentSessionFactory().update(entity);
    }

}
