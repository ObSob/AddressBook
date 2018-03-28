package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.wbh.addressbook.dao.KindDao;
import pers.wbh.addressbook.model.entity.KindEntity;
import pers.wbh.addressbook.model.entity.PersonEntity;
import pers.wbh.addressbook.model.form.Person;
import pers.wbh.addressbook.service.KindService;

import java.sql.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-hibernate.xml", "classpath:applicationContext.xml"})
public class KindTest {
    @Autowired
    KindDao kindDao;

    @Autowired
    KindService kindService;

    @Test
    public void getKind(){
        KindEntity kindEntity = kindDao.getKind(1);
        System.out.println(kindEntity.getKindId() + ": " + kindEntity.getKindName() + '\n' + kindEntity.getPersons().isEmpty());
    }

    @Test
    public void getKind1(){
        KindEntity kindEntity = kindService.getKindById(1);
        System.out.println(kindEntity.getKindId() + ": " + kindEntity.getKindName() + '\n' + kindEntity.getPersons().isEmpty());
    }

    @Test
    public void injectToPerson(){
        KindEntity kindEntity = kindService.getKindById(1);
        PersonEntity personEntity = new PersonEntity();
        personEntity.setKind(kindEntity);
        System.out.println(personEntity.getKind().getKindName());
    }

    @Test
    public void injectToPerson1(){
        Person person = new Person(this.kindService);
        person.setKind(1);
        person.setPersonBirthday(new Date(System.currentTimeMillis()));
        person.setPersonInfo("test");
        person.setPersonName("test");
        person.setPersonTelephone("56451654");

        System.out.println(person.getPersonName() + "\n" + person.getPersonBirthday() + "\n" + person.getPersonInfo() + "\n");

        PersonEntity personEntity = person.toPersonEntity();
        System.out.println("personEntity: " + personEntity.getPersonName());
    }

//    @Test
//    public void injectToPerson2(){
//        Person person = new Person(this.kindService);
//        person.setKind(1);
//        person.setPersonBirthday(new Date(System.currentTimeMillis()));
//        person.setPersonInfo("test");
//        person.setPersonName("test");
//        person.setPersonTelephone("56451654");
//
//        System.out.println(person.getPersonName() + "\n" + person.getPersonBirthday() + "\n" + person.getPersonInfo() + "\n");
//
//        PersonEntity personEntity = new PersonEntity(person);
//        System.out.println(personEntity.getPersonName());
//    }
}
