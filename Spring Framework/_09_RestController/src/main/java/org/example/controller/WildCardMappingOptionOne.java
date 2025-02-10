package org.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("One")
public class WildCardMappingOptionOne {

    @GetMapping(path = "test/*/hello")
    public String test() {
        return "Get Mapping Option One";
    }

    @GetMapping(path = "test/*/*")
    public String test2() {
        return "Get Mapping Option Two";
    }
}
