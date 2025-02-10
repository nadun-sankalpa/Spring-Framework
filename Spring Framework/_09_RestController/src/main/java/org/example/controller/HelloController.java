package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String get() {
        return "Get mapping";
    }

    @PostMapping
    public String post() {
        return "Post Mapping";
    }
    @PutMapping
    public String put() {
        return "Put Mapping";
    }
    @DeleteMapping
    public String delete() {
        return "Delete Mapping";
    }
    @PatchMapping
    public String patch() {
        return "Patch Mapping";
    }
}