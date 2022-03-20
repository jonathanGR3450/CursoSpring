package com.example.cursospring.controller;

import com.example.cursospring.component.Example3Component;
import com.example.cursospring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example3")
public class Example3 {

    public static final String INDEX = "person/create";
    public static final String STORE = "person/store";

    @Autowired
    @Qualifier("example3Component")
    private Example3Component example3Component;

    // para redireccionar
    @GetMapping("/")
    public String redirect(){
        example3Component.sayHello();
        return "redirect:/example3/create";
    }

    /*@RequestMapping("/")
    public RedirectView redirect(){
        return new RedirectView("/example3/create");
    }*/

    @GetMapping("/create")
    public String index(Model model){
        model.addAttribute("person", new Person());
        return INDEX;
    }

    @PostMapping("/store")
    public ModelAndView store(@ModelAttribute("person") Person person){
        ModelAndView mv = new ModelAndView(INDEX);
        mv.addObject("person", person);
        return mv;
    }
}
