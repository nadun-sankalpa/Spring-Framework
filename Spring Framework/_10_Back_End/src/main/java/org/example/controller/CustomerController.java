package org.example.controller;


import org.example.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

    public List<CustomerDTO> customers = new ArrayList<>();

    @PostMapping("save")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        customers.add(customerDTO);
        return customerDTO;
    }

    @PutMapping(path = "update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO){
        for (int i = 0; i < customers.size(); i++) {
            CustomerDTO existingCustomer = customers.get(i);
            if(existingCustomer.getId().equals(customerDTO.getId())){
                customers.set(i,customerDTO);
                return customerDTO;
            }
        }
        return customerDTO;
    }

    @DeleteMapping(path = "delete/{id}")
    public void deleteCustomer(@PathVariable("id") String id){
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getId().equals(id)){
                customers.remove(i);
            }
        }
        System.out.println(id + "This customer is deleted");
    }

    @GetMapping("get")
    public List<CustomerDTO> getAllCustomers(){
        List<CustomerDTO> customerDTOS = new ArrayList<>();
                return customers;

        }

}
