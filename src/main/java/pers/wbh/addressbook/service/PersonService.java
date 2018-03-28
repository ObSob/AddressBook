package pers.wbh.addressbook.service;

import pers.wbh.addressbook.model.entity.PersonEntity;

import java.util.List;

public interface PersonService {

    List<PersonEntity> getAllUser();

    void savePerson(PersonEntity personEntity);
}
