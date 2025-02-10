package org.example.controller;


import org.example.dto.CustomerDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("form")
public class FormDataController {
    @PostMapping
   public String test1(CustomerDTO customerDTO) {
        System.out.println(customerDTO.getFirstName());
        return customerDTO.toString();
    }
}
