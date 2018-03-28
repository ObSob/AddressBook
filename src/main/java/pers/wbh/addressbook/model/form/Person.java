package pers.wbh.addressbook.model.form;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import pers.wbh.addressbook.model.entity.KindEntity;
import pers.wbh.addressbook.model.entity.PersonEntity;
import pers.wbh.addressbook.service.KindService;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Date;

@Component
public class Person implements Serializable {
    @Size(min = 3, max = 20, message = "名字必须在3~20位之间")
    @NotBlank(message = "请输入名字")
    private String personName;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date personBirthday;

    @NotNull(message = "请选择分类")
    private int kind;

    private String personTelephone;

    private String personInfo;

    @Autowired
    private KindService kindService;

    public KindService getKindService() {
        return kindService;
    }

    public void setKindService(KindService kindService) {
        this.kindService = kindService;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Date getPersonBirthday() {
        return personBirthday;
    }

    public void setPersonBirthday(Date personBirthday) {
        this.personBirthday = personBirthday;
    }

    public String getPersonTelephone() {
        return personTelephone;
    }

    public void setPersonTelephone(String personTelephone) {
        this.personTelephone = personTelephone;
    }

    public String getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(String personInfo) {
        this.personInfo = personInfo;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    public PersonEntity toPersonEntity()
    {
        KindEntity kindEntity = kindService.getKindById(this.kind);

        PersonEntity personEntity = new PersonEntity();
        personEntity.setPersonName(this.getPersonName());
        personEntity.setKind(kindEntity);
        personEntity.setPersonTelephone(this.getPersonTelephone());
        personEntity.setPersonInfo(this.getPersonInfo());
        personEntity.setPersonBirthday(this.getPersonBirthday());
        return personEntity;
    }

    public Person(){}

    @Autowired
    public Person(KindService kindService){
        this.kindService = kindService;
    }
}
