package pers.wbh.addressbook.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person", schema = "addressbook")
public class PersonEntity {
    private Integer personId;
    private String personName;
    private Date personBirthday;
    private KindEntity kind;
    private String personTelephone;
    private String personInfo;

    @Id
    @Column(name = "personId", nullable = false, insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // 这个很烦， 记得要设置， 说明在下边
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
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
    @Column(name = "personBirthday", insertable = false)
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
    @Column(name = "personTelephone", length = 50, insertable = false)
    public String getPersonTelephone() {
        return personTelephone;
    }

    public void setPersonTelephone(String personTelephone) {
        this.personTelephone = personTelephone;
    }

    @Basic
    @Column(name = "personInfo", insertable = false, length = 300)
    public String getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(String personInfo) {
        this.personInfo = personInfo;
    }

    public PersonEntity(){}

//    public PersonEntity(Person person)
//    {
//        KindService kindService = new KindServiceImpl();
//
//        this.kind = kindService.getKindById(person.getKind());
//        this.personBirthday = person.getPersonBirthday();
//        this.personName = person.getPersonName();
//        this.personInfo = person.getPersonInfo();
//        this.personTelephone = person.getPersonTelephone();
//    }
}



/*
 *  GenerationType.IDENTITY
 *
 * Indicates that the persistence provider must assign
 * primary keys for the entity using a database identity column.
 */