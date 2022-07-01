package com.moseswilliamsiii.springjokesapp;

import com.moseswilliamsiii.services.JokesService;
import com.moseswilliamsiii.services.JokesServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJokesAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringJokesAppApplication.class, args);

        JokesService jokesService = new JokesServiceImpl();

        System.out.println(jokesService.getRandomJoke());
    }

}
