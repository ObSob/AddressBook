package pers.wbh.addressbook.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person", schema = "addressbook")
public class PersonEntity {
    private int personId;
    private String personName;
    private Date personBirthday;
    private Integer kindId;
    private String personTelephone;
    private String personInfo;

    @Id
    @Column(name = "personId", nullable = false, insertable = false)
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "personName", nullable = false, length = 30)
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "personBirthday", nullable = true)
    public Date getPersonBirthday() {
        return personBirthday;
    }

    public void setPersonBirthday(Date personBirthday) {
        this.personBirthday = personBirthday;
    }

    @Basic
    @Column(name = "kindId", nullable = true)
    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    @Basic
    @Column(name = "personTelephone", nullable = true, length = 50)
    public String getPersonTelephone() {
        return personTelephone;
    }

    public void setPersonTelephone(String personTelephone) {
        this.personTelephone = personTelephone;
    }


    @Basic
    @Column(name = "personInfo", nullable = true, length = 300)
    public String getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(String personInfo) {
        this.personInfo = personInfo;
    }

}
