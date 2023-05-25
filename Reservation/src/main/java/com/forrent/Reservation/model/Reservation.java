package com.forrent.Reservation.model;

import javax.persistence.*;
import java.util.Calendar;

@Entity //represents a table stored in a database
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //indicates that the primary key is generated automatically during the insertion in the database
    private int id;
    @Column
    private Calendar start_date;
    @Column
    private Calendar end_date;
    @Column
    private Float estimated_km;
    @Column
    private Float total_price;
    @Column
    private int id_vehicles;
    @Column
    private int id_customers;


    public Reservation() {

    }
    public Reservation(int id, Calendar start_date, Calendar end_date, Float estimated_km, Float total_price, int id_vehicles, int id_customers) {
        this.id = id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.estimated_km = estimated_km;
        this.total_price = total_price;
        this.id_vehicles = id_vehicles;
        this.id_customers = id_customers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getStart_date() {
        return start_date;
    }

    public void setStart_date(Calendar start_date) {
        this.start_date = start_date;
    }

    public Calendar getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Calendar end_date) {
        this.end_date = end_date;
    }

    public Float getEstimated_km() {
        return estimated_km;
    }

    public void setEstimated_km(Float estimated_km) {
        this.estimated_km = estimated_km;
    }

    public Float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Float total_price) {
        this.total_price = total_price;
    }

    public int getId_vehicles() {
        return id_vehicles;
    }

    public void setId_vehicles(int id_vehicles) {
        this.id_vehicles = id_vehicles;
    }

    public int getId_customers() {
        return id_customers;
    }

    public void setId_customers(int id_customers) {
        this.id_customers = id_customers;
    }

    @Override //define a method that is inherited from the parent class
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", estimated_km=" + estimated_km +
                ", total_price=" + total_price +
                ", id_vehicles=" + id_vehicles +
                ", id_customers=" + id_customers +
                '}';
    }
}
