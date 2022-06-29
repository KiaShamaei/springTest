package com.example.demo.dao;

import com.example.demo.entity.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;
@DataJpaTest
class CustomerDaoTest {
    @Autowired
    private CustomerDao customerDao;


    @Test
    void itShouldSelectEmailExist() {
        //given
        String email = "ali@gmail.com";
        Customer customer = new Customer( "kami" , email);
        customerDao.save(customer);

        //when
        Boolean exists = customerDao.selectEmailExist(email);
        //then
        assertTrue(exists);
    }
}