package com.puhj.ssmdemo.controller;

import com.puhj.ssmdemo.entity.Person;
import com.puhj.ssmdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller("indexController")
public class IndexController {

    @Autowired
    private PersonService personService;

    @GetMapping("/index")
    public String getAll(ModelMap modelMap) {
        List<Person> personList = personService.getAll();
        modelMap.addAttribute("persons", personList);
        return "persons";
    }
}
