package pers.wbh.addressbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pers.wbh.addressbook.model.entity.KindEntity;
import pers.wbh.addressbook.model.form.Person;
import pers.wbh.addressbook.service.KindService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("add")
public class AddInfoController {
    @Autowired
    KindService kindService;

    @ModelAttribute("person")
    public Person createFormBean() {
        return new Person();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String add(Model model)
    {
        List<KindEntity> kindList = kindService.getAllKind();
        model.addAttribute("kindList", kindList);
        return "addPage";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String addUser(@Valid Person person, Errors errors)
    {
        if(errors.hasErrors())
            return "addPage";
        System.out.println("input correct");
        return "redirect:/";
    }
}
