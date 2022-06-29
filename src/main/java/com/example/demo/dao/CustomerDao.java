package com.example.demo.dao;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN " +
    "TRUE ELSE FALSE END FROM Customer c WHERE c.email =:email"
    )
    Boolean selectEmailExist(@Param("email") String email);
}
