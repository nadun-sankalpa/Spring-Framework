package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamsController {
    @GetMapping(params = {"id","name"})
    public String test1(@RequestParam(value = "id") String id, @RequestParam(value = "name") String name) {
        return id+" "+name;
    }
}