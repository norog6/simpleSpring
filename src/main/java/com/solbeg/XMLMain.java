package com.solbeg;

import com.solbeg.service.UserService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XMLMain {
    public static void main(String[] args) {
        var context = new GenericXmlApplicationContext("classpath:applicationContext.xml");

        var userService = context.getBean(UserService.class);
        System.out.println(userService.findAll());
    }
}