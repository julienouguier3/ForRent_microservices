package com.forrent.Vehicle.dao;

import com.forrent.Vehicle.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleDao extends JpaRepository<Vehicle, Integer> {

    Vehicle findById(int id); //return a product by its Id
    List<Vehicle> findByDescriptionContaining(String description);

}
