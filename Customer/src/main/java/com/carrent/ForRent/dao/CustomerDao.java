package com.carrent.ForRent.dao;

import com.carrent.ForRent.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

    Customer findById(int id); //return a product by its Id

    List<Customer> findByLastnameOrLicenseNumber(String lastname, String licenseNumber);

}
