package com.forrent.Vehicle.model;

import javax.persistence.*;
import java.util.Calendar;

@Entity
public class Vehicle {

    @Id
    private int id;
    @Column
    private String description;
    @Column
    private String registration;
    @Column
    private String brand;
    @Column
    private int priceReservation;
    @Column
    private int horsePower;
    @Column
    private int kilometers;
    @Column
    private Calendar year;
    @Column()
    private String fuel;

    @Column
    private int cylinder;
    @Column
    private int trunkSpace;
    @JoinColumn
    @ManyToOne(targetEntity = Category.class)
    private Category category;


    public Vehicle(int id, String description, String registration, String brand, int priceReservation, int horsePower, int kilometers, Calendar year, String fuel, int cylinder, int trunkSpace, Category category) {
        this.id = id;
        this.description = description;
        this.registration = registration;
        this.brand = brand;
        this.priceReservation = priceReservation;
        this.horsePower = horsePower;
        this.kilometers = kilometers;
        this.year = year;
        this.fuel = fuel;
        this.cylinder = cylinder;
        this.trunkSpace = trunkSpace;
        this.category = category;
    }

    public Vehicle() {

    }

    public Vehicle(Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPriceReservation() {
        return priceReservation;
    }

    public void setPriceReservation(int priceReservation) {
        this.priceReservation = priceReservation;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public Calendar getYear() {
        return year;
    }

    public void setYear(Calendar year) {
        this.year = year;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getTrunkSpace() {
        return trunkSpace;
    }

    public void setTrunkSpace(int trunkSpace) {
        this.trunkSpace = trunkSpace;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", registration='" + registration + '\'' +
                ", brand='" + brand + '\'' +
                ", priceReservation=" + priceReservation +
                ", horsePower=" + horsePower +
                ", kilometers=" + kilometers +
                ", year=" + year +
                ", fuel='" + fuel + '\'' +
                ", cylinder=" + cylinder +
                ", trunkSpace=" + trunkSpace +
                ", category=" + category +
                '}';
    }
}

