package pers.wbh.addressbook.dao;

public interface BaseDao<T> {
    void save(T entity);

    void update(T entity);

}
