package com.jayrodharv.ngosmpboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BuildController {
    @GetMapping("/builds")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
