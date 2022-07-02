package com.moseswilliamsiii.springjokesapp.controllers;

import com.moseswilliamsiii.springjokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokesService jokesService;


    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        String joke = jokesService.getRandomJoke();
        model.addAttribute("joke",joke);

        return "index";
    }
}
