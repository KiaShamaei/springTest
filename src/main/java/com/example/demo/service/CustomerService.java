package com.example.demo.service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.el.ELException;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
    public List<Customer> findAll(){
        return  customerDao.findAll();
    }
    public Optional<Customer> findById(int id){
        return customerDao.findById(id);
    }
    public Customer edit(Customer customer) throws Exception{
        Customer customerEdit = customerDao.findById(customer.getId()).orElseThrow(()->new Exception());
            customerEdit.setName(customer.getName());
            customerEdit.setEmail(customer.getEmail());
            return customerEdit;

    }
    public void delete(int id){
        customerDao.deleteById(id);
    }
}
