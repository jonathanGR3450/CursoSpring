package com.example.cursospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/get")
public class Example2 {

    private static final String URL_BASE = "example2";

    @GetMapping("/name")
    // para enviar parametros get por la url
    public ModelAndView getParams(@RequestParam(name = "nm", required = false, defaultValue = "invitado") String name){
        ModelAndView mv = new ModelAndView(URL_BASE);
        mv.addObject("name", name);
        return mv;
    }

    @GetMapping("/edit/{id}")
    // para obtener la variable de la url
    public ModelAndView getParams2(@PathVariable("id") String name){
        ModelAndView mv = new ModelAndView(URL_BASE);
        mv.addObject("name", name);
        return mv;
    }
}
