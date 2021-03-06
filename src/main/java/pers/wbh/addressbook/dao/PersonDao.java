package pers.wbh.addressbook.dao;

import org.springframework.stereotype.Repository;
import pers.wbh.addressbook.model.entity.PersonEntity;

import java.util.List;

@Repository
public interface PersonDao extends BaseDao<PersonEntity>{
    List<PersonEntity> findAllUser();

    void savePerson(PersonEntity personEntity);
}
