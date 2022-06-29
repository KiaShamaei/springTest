package com.example.demo.controller;


import com.example.demo.dao.CustomerDao;
import com.example.demo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/test")
public class CustomerController {
    @Autowired
    CustomerDao customerDao;
    @PostMapping("/add")
    public Optional<Customer> addCustomer(@RequestBody Customer customer){
        customerDao.save(customer);
        return customerDao.findById(customer.getId());
    }
    @GetMapping("/hello")
    public String testHello(){
        return "hello";
    }
}
