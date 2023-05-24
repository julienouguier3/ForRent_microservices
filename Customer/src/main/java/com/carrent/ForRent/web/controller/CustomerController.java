package com.carrent.ForRent.web.controller;

import com.carrent.ForRent.dao.CustomerDao;
import com.carrent.ForRent.model.Customer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController //
@RequestMapping("/customers") //WARNING : /!\ Avoid redundancy /!\
public class CustomerController {

    private final CustomerDao customerDao;
    private final RestTemplate restTemplate;

    @Autowired //allows you to activate the automatic dependency injection
    public CustomerController(CustomerDao customerDao, RestTemplate restTemplate) {
        this.customerDao = customerDao;
        this.restTemplate = restTemplate;
    }


    @GetMapping()
    @Operation(description = "Allow you to get the list of all customers", summary = "Get All Customers")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Success"), @ApiResponse(responseCode = "404", description = "Error not found")})
    public List<Customer> list() {
        return customerDao.findAll();
    }

    @GetMapping(value = "/{id}")
    public Customer show(@PathVariable int id) {
        return customerDao.findById(id);
    }

    @PostMapping()
    public Customer add(@RequestBody Customer customer) {
        String license = customer.getLicenseNumber();
        String url = "http://localhost:8081/licenses/" + license;
        Boolean response = restTemplate.getForObject(url, Boolean.class);
        if (Boolean.TRUE.equals(response)) {
            return customerDao.save(customer);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Passe ton permis bordel !");
        }
    }

    @PutMapping()
    public Customer update(@RequestBody Customer customer) {
        return customerDao.save(customer);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        customerDao.delete(customerDao.findById(id));
        return "Customer " + id + " is deleted";
    }

    @GetMapping("/filter_by/{variable}")
    public List<Customer> filterVariables(@PathVariable String variable) {
        return customerDao.findByLastnameOrLicenseNumber(variable, variable);
    }
}
