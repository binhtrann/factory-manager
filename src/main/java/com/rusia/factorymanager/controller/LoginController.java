package com.rusia.factorymanager.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping("/login")
    public ModelAndView login(Model model) {
        return new ModelAndView("login");
    }

    @GetMapping("/index")
    public ModelAndView index(Model model) {
        return new ModelAndView("index");
    }


}
