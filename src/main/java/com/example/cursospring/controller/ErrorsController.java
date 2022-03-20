package com.example.cursospring.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorsController {

    public static final String IES_VIEW = "/error/500";

    @ExceptionHandler(Exception.class)
    public String ShowInternalServer (){
        return IES_VIEW;
    }
}
