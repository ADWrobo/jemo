package io.aiven.spring.mysql.jemo;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/")
    public String helloworld(Model model) {
        Optional<User> user = userRepository.findById(2);

        if (user.isPresent()) {
            model.addAttribute("message", "Hello World!");
            model.addAttribute("name", user.get().getName());
        } else {
            model.addAttribute("message", "Hello World!");
        }
        return "helloworld";
    }
}
