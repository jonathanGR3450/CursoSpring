package com.example.cursospring.controller;

import com.example.cursospring.model.Person;
import com.example.cursospring.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping
public class HomeController {

    @Autowired
    @Qualifier("exampleService")
    private ExampleService exampleService;

    @GetMapping("/home1")
    public String index(Model model) {
        model.addAttribute("persons", exampleService.getListPerson());
        return "index";
    }

    @GetMapping("/home2")
    public ModelAndView index2(){

        ModelAndView mv = new ModelAndView("index");
        mv.addObject("persons", exampleService.getListPerson());
        return mv;
    }




}
