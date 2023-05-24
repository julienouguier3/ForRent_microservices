package com.forrent.Reservation.web.controller;

import com.forrent.Reservation.dao.ReservationDao;
import com.forrent.Reservation.model.Reservation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    private final ReservationDao reservationDao;


    public ReservationController(ReservationDao reservationDao) {
        this.reservationDao = reservationDao;
    }

    @GetMapping()
    @Operation(description = "Allow you to get the list of all reservations", summary = "Get All Reservation")
    @ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Success"), @ApiResponse(responseCode = "404", description = "Error not found")})
    public List<Reservation> list() {
        return reservationDao.findAll();
    }

    @GetMapping("/{id}")
    public Reservation show(@PathVariable int id) {
        return reservationDao.findById(id);
    }

    @PostMapping()
    public Reservation add(@RequestBody Reservation reservation) {
        return reservationDao.save(reservation);
    }

    @PutMapping()
    public Reservation update(@RequestBody Reservation reservation) {
        return reservationDao.save(reservation);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        reservationDao.delete(reservationDao.findById(id));
        return "Reservation " + id + " canceled";
    }



}
