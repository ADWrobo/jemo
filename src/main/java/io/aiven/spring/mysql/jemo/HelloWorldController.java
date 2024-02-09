package io.aiven.spring.mysql.jemo;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String helloworld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "helloworld";
    }
}
