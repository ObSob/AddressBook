package pers.wbh.addressbook.dao;

import org.springframework.stereotype.Repository;
import pers.wbh.addressbook.model.entity.KindEntity;

import java.util.List;

@Repository
public interface KindDao extends BaseDao<KindEntity> {
    List<KindEntity> findAllKind();
}
