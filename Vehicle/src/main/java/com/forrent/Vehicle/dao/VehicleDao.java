package com.forrent.Vehicle.dao;

import com.forrent.Vehicle.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleDao extends JpaRepository<Vehicle, Integer> {

    Vehicle findById(int id); //return a product by its Id
    List<Vehicle> findByDescriptionContaining(String description);
    List<Vehicle> findByHorsePowerLessThan(int horsePower);

}
