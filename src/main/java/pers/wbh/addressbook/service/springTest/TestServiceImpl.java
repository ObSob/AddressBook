package pers.wbh.addressbook.service.springTest;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    public String test() {
        return "DI test success";
    }
}
