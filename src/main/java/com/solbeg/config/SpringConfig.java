package com.solbeg.config;

import com.solbeg.repository.UserRepository;
import com.solbeg.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

   @Bean
    public UserRepository userRepository() {
        return new UserRepository();
   }
   @Bean
    public UserService userService(){
       return new UserService(userRepository());
   }
}