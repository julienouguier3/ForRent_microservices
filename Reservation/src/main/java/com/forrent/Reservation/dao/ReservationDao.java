package com.forrent.Reservation.dao;

import com.forrent.Reservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ReservationDao extends JpaRepository<Reservation, Integer> {
    Reservation findById(int id);
}
