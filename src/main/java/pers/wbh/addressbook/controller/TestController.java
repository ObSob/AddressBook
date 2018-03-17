package pers.wbh.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.wbh.addressbook.service.TestKindService;
import pers.wbh.addressbook.service.TestPersonService;


@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestKindService kindService;

    @Autowired
    private TestPersonService personService;

    @RequestMapping("/addKind")
    @ResponseBody
    public String addKind(){
        kindService.saveKind();
        return "success";
    }

    @RequestMapping("/addPerson")
    @ResponseBody
    public String addPerson(){
        personService.savePerson();
        return "success";
    }
}
