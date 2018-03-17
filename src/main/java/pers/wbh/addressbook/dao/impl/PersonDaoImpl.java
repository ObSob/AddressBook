package pers.wbh.addressbook.dao.impl;

import org.springframework.stereotype.Repository;
import pers.wbh.addressbook.dao.PersonDao;
import pers.wbh.addressbook.model.entity.PersonEntity;

@Repository
public class PersonDaoImpl extends BaseDaoImpl<PersonEntity> implements PersonDao {

}
