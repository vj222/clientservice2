package com.example.clientservice2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "clientservice2")
public class ClientService2Controller {

    @Autowired
    Environment environment;

    @RequestMapping(value="/getMessage", method = RequestMethod.GET)
    public String getMessage() {
        return environment.getProperty("welcome.message2");
    }

}
