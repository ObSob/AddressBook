package pers.wbh.addressbook.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "kind", schema = "addressbook")
public class KindEntity {
    private int kindId;
    private String kindName;
    private Set<PersonEntity> persons;

    @Id
    @Column(name = "kindId", nullable = false)
    public int getKindId() {
        return kindId;
    }

    public void setKindId(int kindId) {
        this.kindId = kindId;
    }

    @Basic
    @Column(name = "kindName", nullable = false, length = 10)
    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    @OneToMany(mappedBy = "kind", cascade = CascadeType.ALL)
    public Set<PersonEntity> getPersons() {
        return persons;
    }

    public void setPersons(Set<PersonEntity> persons) {
        this.persons = persons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KindEntity that = (KindEntity) o;

        if (kindId != that.kindId) return false;
        if (kindName != null ? !kindName.equals(that.kindName) : that.kindName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kindId;
        result = 31 * result + (kindName != null ? kindName.hashCode() : 0);
        return result;
    }

    public KindEntity(){}

    public KindEntity(int kindId, String kindName){
        this.kindId = kindId;
        this.kindName = kindName;
    }

}
