package com.rusia.factorymanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/add")
    public String add(){
        return "employee/add";
    }

    @GetMapping()
    public ModelAndView visa(Model model) {
        return new ModelAndView("employee/list");
    }
}
