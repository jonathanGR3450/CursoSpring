package com.example.cursospring.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("example3Component")
public class Example3Component {

    private static final Log LOGGER = LogFactory.getLog(Example3Component.class);
    public void sayHello(){
        LOGGER.info("HOLA MUNDO");
    }
}
