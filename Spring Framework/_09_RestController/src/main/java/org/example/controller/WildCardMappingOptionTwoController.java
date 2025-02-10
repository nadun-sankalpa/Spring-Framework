package org.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("two")
public class WildCardMappingOptionTwoController {

   // @GetMapping(path = "test/**/hello")
    public String test1() {
        return "Test1";
    }
}
