package com.thoughtworks.springboot.controller;

import com.thoughtworks.springboot.data.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config-service")
public class ConfigController {

    @Autowired
    private Environment env;

    @RequestMapping(value = "/message", method = RequestMethod.GET, produces = "application/json")
    public Message getMessage() {
        return new Message(env.getProperty("app.global.message") , env.getProperty("app.local.message"));
    }
}
