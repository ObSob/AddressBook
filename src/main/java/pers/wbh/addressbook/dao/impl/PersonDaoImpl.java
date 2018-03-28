package pers.wbh.addressbook.dao.impl;

import org.springframework.stereotype.Repository;
import pers.wbh.addressbook.dao.PersonDao;
import pers.wbh.addressbook.model.entity.PersonEntity;

import java.util.List;

@Repository
public class PersonDaoImpl extends BaseDaoImpl<PersonEntity> implements PersonDao {

    @SuppressWarnings("unchecked")
    public List<PersonEntity> findAllUser() {
        return (List<PersonEntity>) this.getCurrentSessionFactory().createQuery("from PersonEntity").list();
    }

    public void savePerson(PersonEntity personEntity) {
        this.getCurrentSessionFactory().save(personEntity);
    }
}
