package pers.wbh.addressbook.model.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "person", schema = "addressbook")
public class PersonEntity {
    private int personId;
    private String personName;
    private String personNickname;
    private String personSex;
    private Date personBirthday;
    private Integer kindId;
    private String personTelephone;
    private String personQq;
    private Integer column9;
    private String personEmail;
    private String personAddress;
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

    @Basic
    @Column(name = "personNickname", nullable = true, length = 30)
    public String getPersonNickname() {
        return personNickname;
    }

    public void setPersonNickname(String personNickname) {
        this.personNickname = personNickname;
    }

    @Basic
    @Column(name = "personSex", nullable = true, length = 4)
    public String getPersonSex() {
        return personSex;
    }

    public void setPersonSex(String personSex) {
        this.personSex = personSex;
    }

    @Basic
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
    @Column(name = "personQQ", nullable = true, length = 30)
    public String getPersonQq() {
        return personQq;
    }

    public void setPersonQq(String personQq) {
        this.personQq = personQq;
    }

    @Basic
    @Column(name = "column_9", nullable = true)
    public Integer getColumn9() {
        return column9;
    }

    public void setColumn9(Integer column9) {
        this.column9 = column9;
    }

    @Basic
    @Column(name = "personEmail", nullable = true, length = 30)
    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    @Basic
    @Column(name = "personAddress", nullable = true, length = 50)
    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    @Basic
    @Column(name = "personInfo", nullable = true, length = 300)
    public String getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(String personInfo) {
        this.personInfo = personInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (personId != that.personId) return false;
        if (personName != null ? !personName.equals(that.personName) : that.personName != null) return false;
        if (personNickname != null ? !personNickname.equals(that.personNickname) : that.personNickname != null)
            return false;
        if (personSex != null ? !personSex.equals(that.personSex) : that.personSex != null) return false;
        if (personBirthday != null ? !personBirthday.equals(that.personBirthday) : that.personBirthday != null)
            return false;
        if (kindId != null ? !kindId.equals(that.kindId) : that.kindId != null) return false;
        if (personTelephone != null ? !personTelephone.equals(that.personTelephone) : that.personTelephone != null)
            return false;
        if (personQq != null ? !personQq.equals(that.personQq) : that.personQq != null) return false;
        if (column9 != null ? !column9.equals(that.column9) : that.column9 != null) return false;
        if (personEmail != null ? !personEmail.equals(that.personEmail) : that.personEmail != null) return false;
        if (personAddress != null ? !personAddress.equals(that.personAddress) : that.personAddress != null)
            return false;
        if (personInfo != null ? !personInfo.equals(that.personInfo) : that.personInfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId;
        result = 31 * result + (personName != null ? personName.hashCode() : 0);
        result = 31 * result + (personNickname != null ? personNickname.hashCode() : 0);
        result = 31 * result + (personSex != null ? personSex.hashCode() : 0);
        result = 31 * result + (personBirthday != null ? personBirthday.hashCode() : 0);
        result = 31 * result + (kindId != null ? kindId.hashCode() : 0);
        result = 31 * result + (personTelephone != null ? personTelephone.hashCode() : 0);
        result = 31 * result + (personQq != null ? personQq.hashCode() : 0);
        result = 31 * result + (column9 != null ? column9.hashCode() : 0);
        result = 31 * result + (personEmail != null ? personEmail.hashCode() : 0);
        result = 31 * result + (personAddress != null ? personAddress.hashCode() : 0);
        result = 31 * result + (personInfo != null ? personInfo.hashCode() : 0);
        return result;
    }
}
