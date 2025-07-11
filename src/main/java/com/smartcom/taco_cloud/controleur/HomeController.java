package com.smartcom.taco_cloud.controleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(name = "home", value = "/")
    public String home() {
        return "home";
    }
}
