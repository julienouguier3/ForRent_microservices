package com.forrent.Vehicle.web.controller;

import com.forrent.Vehicle.dao.VehicleDao;
import com.forrent.Vehicle.model.Vehicle;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles") //WARNING : /!\ Avoid redundancy /!\
public class VehicleController {


    private final VehicleDao vehicleDao;


    public VehicleController(VehicleDao vehicleDao) {
        this.vehicleDao = vehicleDao;

    }


    @GetMapping()
    @Operation(description = "Allow you to get the list of all customers", summary = "Get All Customers")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Success"), @ApiResponse(responseCode = "404", description = "Error not found")})
    public List<Vehicle> list() {
        return vehicleDao.findAll();
    }

    @GetMapping(value = "/{id}")
    public Vehicle show(@PathVariable int id) {
        return vehicleDao.findById(id);
    }

    @PostMapping()
    public Vehicle add(@RequestBody Vehicle vehicle) {
        return vehicleDao.save(vehicle);
    }

    @PutMapping()
    public Vehicle update(@RequestBody Vehicle vehicle) {
        return vehicleDao.save(vehicle);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        vehicleDao.delete(vehicleDao.findById(id));
        return "Vehicle " + id + " is deleted";
    }

    @GetMapping("/filter_by/{variable}")
    public List<Vehicle> filterVariables(@PathVariable String variable) {
        return vehicleDao.findByDescriptionContaining(variable);
    }


}

