package pers.wbh.addressbook.dao.impl;

import org.springframework.stereotype.Repository;
import pers.wbh.addressbook.dao.KindDao;
import pers.wbh.addressbook.model.entity.KindEntity;

import java.util.List;

@Repository
public class KindDaoImpl extends BaseDaoImpl<KindEntity> implements KindDao {

    @SuppressWarnings("unchecked")
    public List<KindEntity> findAllKind() {
        return (List<KindEntity>) this.getCurrentSessionFactory().createQuery("from KindEntity ").list();
    }
}
