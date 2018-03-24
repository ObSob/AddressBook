package pers.wbh.addressbook.model.form;

public class Kind {
    private int kindId;
    private String kindName;

    public int getKindId() {
        return kindId;
    }

    public void setKindId(int kindId) {
        this.kindId = kindId;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public Kind(){}

    public Kind(int id, String name) {
        this.kindId = id;
        this.kindName = name;
    }
}
