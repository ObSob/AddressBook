package pers.wbh.addressbook.dao;

public interface BaseDao<T> {
    public void save(T entity);

    public void update(T entity);

}
