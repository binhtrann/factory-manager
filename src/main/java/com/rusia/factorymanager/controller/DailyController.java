package com.rusia.factorymanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/daily")
public class DailyController {
    @GetMapping()
    public String salary(){
        return "daily/list";
    }
}
