package pers.wbh.addressbook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.wbh.addressbook.dao.KindDao;
import pers.wbh.addressbook.model.entity.KindEntity;
import pers.wbh.addressbook.service.KindService;

import java.util.List;

@Service
@Transactional
public class KindServiceImpl implements KindService {
    @Autowired
    KindDao kindDao;

    public List<KindEntity> getAllKind() {
        return kindDao.findAllKind();
    }

    public KindEntity getKindById(int id) {
        return kindDao.getKind(id);
    }

    public void saveKind(KindEntity kindEntity) {
        kindDao.save(kindEntity);
    }
}
