package com.carrent.ForRent.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;


@Entity
public class Customer {
    @Id
    private int id;
    @Column
    private String lastname;
    @Column
    private String firstname;
    @Column
    private Calendar dateOfBirth;
    @Column
    private String licenseNumber;
    @Column
    private String mail;


    public Customer(int id, String lastname, String firstname, Calendar dateOfBirth, String licenseNumber, String mail) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.dateOfBirth = dateOfBirth;
        this.licenseNumber = licenseNumber;
        this.mail = mail;
    }

    public Customer() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", lastname='" + lastname + '\'' + ", firstname='" + firstname + '\'' + ", dateOfBirth=" + dateOfBirth + ", licenseNumber='" + licenseNumber + '\'' + ", mail='" + mail + '\'' + '}';
    }
}
