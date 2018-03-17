package pers.wbh.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.wbh.addressbook.service.TestKindService;


@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestKindService kindService;

    @RequestMapping("/addKind")
    @ResponseBody
    public String addKind(){
        kindService.saveKind();

        return "success";
    }
}
