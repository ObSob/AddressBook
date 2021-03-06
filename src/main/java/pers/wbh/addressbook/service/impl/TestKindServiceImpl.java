package pers.wbh.addressbook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.wbh.addressbook.dao.KindDao;
import pers.wbh.addressbook.model.entity.KindEntity;
import pers.wbh.addressbook.service.TestKindService;

@Service
@Transactional
public class TestKindServiceImpl implements TestKindService {
    @Autowired
    private KindDao kindDao;

    public void saveKind() {
        KindEntity kind = new KindEntity(1, "test");
        kindDao.save(kind);
    }
}
