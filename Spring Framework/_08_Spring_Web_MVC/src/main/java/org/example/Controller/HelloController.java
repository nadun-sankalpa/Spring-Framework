package org.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/hello")
public class HelloController {
    public HelloController() {
        System.out.println("HelloController");
    }
@GetMapping
    public String sayHello() {
        return "index";
    }
}
