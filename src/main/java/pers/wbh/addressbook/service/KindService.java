package pers.wbh.addressbook.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.wbh.addressbook.model.entity.KindEntity;

import java.util.List;

@Service
@Transactional
public interface KindService {
    List<KindEntity> getAllKind();
}
