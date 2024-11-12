package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "driver_id")
    private String driverID;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone")
    private String phoneNumber;

    // Default constructor
    public User() {}

    // Constructor with fields
    public User(String driverID, String firstName, String lastName, String phoneNumber) {
        this.driverID = driverID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // toString, equals, and hashCode methods
    @Override
    public String toString() {
        return "User [driverID=" + driverID + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return driverID != null ? driverID.equals(user.driverID) : user.driverID == null;
    }

    @Override
    public int hashCode() {
        return driverID != null ? driverID.hashCode() : 0;
    }
}
