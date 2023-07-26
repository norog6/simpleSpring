package com.solbeg;

import com.solbeg.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

      var context=new  AnnotationConfigApplicationContext("com.solbeg");
      var userService =context.getBean(UserService.class);
        System.out.println(userService.findAll());

    }
}