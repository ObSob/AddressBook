package pers.wbh.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.wbh.addressbook.model.entity.KindEntity;
import pers.wbh.addressbook.model.entity.PersonEntity;
import pers.wbh.addressbook.service.KindService;
import pers.wbh.addressbook.service.PersonService;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private PersonService personService;

    @Autowired
    private KindService kindService;

    @RequestMapping("/")
    public String user(Model model)
    {
        List<PersonEntity> users = personService.getAllUser();
        List<KindEntity> kinds = kindService.getAllKind();
        model.addAttribute("users", users);
        model.addAttribute("kinds", kinds);
        return "userPage";
    }
}
