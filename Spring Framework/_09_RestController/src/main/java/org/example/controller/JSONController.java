package org.example.controller;

import org.example.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("json")
public class JSONController {
    @PostMapping
    public String test(@RequestBody CustomerDTO customerDTO){
        return customerDTO.getFirstName();
    }
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDTO test2(){
        return new CustomerDTO("Mahesha","Dinushan",27);
    }
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE},path = "list")
    public List<CustomerDTO> test3(){ return List.of(new CustomerDTO("Mahesha","Dinushan",27),new CustomerDTO("Nadun","Sankalpa",21)); } //List<CustomerDTO>
}