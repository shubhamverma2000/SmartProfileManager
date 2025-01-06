package com.scm.SmartContactManager.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("isLogin" , false);
        return "home";
    }

    @GetMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isLogin" , true);
        return "about";
    }

    @GetMapping("/services")
    public String servicePage(){
        return "services";
    }
}
