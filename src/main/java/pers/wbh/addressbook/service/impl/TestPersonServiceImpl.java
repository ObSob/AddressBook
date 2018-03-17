package pers.wbh.addressbook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.wbh.addressbook.dao.PersonDao;
import pers.wbh.addressbook.model.entity.PersonEntity;
import pers.wbh.addressbook.service.TestPersonService;

import java.sql.Date;

@Service
public class TestPersonServiceImpl implements TestPersonService {
    @Autowired
    private PersonDao personDao;

    public void savePerson() {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setKindId(1);
        personEntity.setPersonBirthday(new Date(System.currentTimeMillis()));
        personEntity.setPersonId(1);
        personEntity.setPersonInfo("test");
        personEntity.setPersonName("wang");
        personEntity.setPersonTelephone("18871199790");
        personDao.save(personEntity);
    }
}
