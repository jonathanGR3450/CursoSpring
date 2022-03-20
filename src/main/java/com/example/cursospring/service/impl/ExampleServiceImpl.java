package com.example.cursospring.service.impl;

import com.example.cursospring.model.Person;
import com.example.cursospring.service.ExampleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
    @Override
    public List<Person> getListPerson() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("uno", 21));
        personList.add(new Person("dos", 23));
        return personList;
    }
}
