package pers.wbh.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.wbh.addressbook.model.entity.PersonEntity;
import pers.wbh.addressbook.service.PersonService;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    PersonService personService;

    @RequestMapping("/")
    public String user(Model model)
    {
        List<PersonEntity> list = personService.getAllUser();
        model.addAttribute("users", list);

        System.out.println(list.get(0).getPersonName());

        return "user";
    }
}
