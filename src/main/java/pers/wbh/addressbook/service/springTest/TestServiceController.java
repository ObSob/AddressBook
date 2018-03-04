package pers.wbh.addressbook.service.springTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestServiceController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test/service")
    @ResponseBody
    public String test()
    {
        return testService.test();
    }
}
