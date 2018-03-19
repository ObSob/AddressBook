package pers.wbh.addressbook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.wbh.addressbook.dao.PersonDao;
import pers.wbh.addressbook.model.entity.PersonEntity;
import pers.wbh.addressbook.service.PersonService;

import java.util.List;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;

    public List<PersonEntity> getAllUser() {
        return personDao.findAllUser();
    }
}
