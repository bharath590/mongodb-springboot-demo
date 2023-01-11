package com.code.hiberantejpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    CustomerRepo customerRepo;

    @GetMapping("/employees")
    public String find(){
        Customer customer = new Customer("bharath","goud");
        customerRepo.save(customer);
        return "saved";
    }
    @GetMapping("/employee")
    public List<Customer> findAll(){
        return customerRepo.findAll();
    }
}
