package com.example.demo.service;

import com.example.demo.dao.CustomerDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class CustomerServiceTest {
    @Mock
    private CustomerDao customerDao;
    private CustomerService underTest;
    private AutoCloseable autoCloseable;

    @BeforeEach
    void setUp(){
        autoCloseable =MockitoAnnotations.openMocks(this);
        underTest = new CustomerService(customerDao);
    }
    @AfterEach
    void tearDown() throws Exception{
        autoCloseable.close();
    }

    @Test
    void findAll() {
        //when
        underTest.findAll();
        //then
        verify(customerDao).findAll();
    }
}