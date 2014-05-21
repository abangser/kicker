package main.java.com.abangser.kicker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String loadHomePage(Model m) {
        m.addAttribute("name", "Kicker");
        return "home";
    }
}
