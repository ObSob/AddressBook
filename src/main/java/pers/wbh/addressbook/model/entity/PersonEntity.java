package pers.wbh.addressbook.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person", schema = "addressbook")
public class PersonEntity {
    private int personId;
    private String personName;
    private Date personBirthday;
    private KindEntity kind;
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

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public KindEntity getKind() {
        return kind;
    }

    public void setKind(KindEntity kind) {
        this.kind = kind;
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
