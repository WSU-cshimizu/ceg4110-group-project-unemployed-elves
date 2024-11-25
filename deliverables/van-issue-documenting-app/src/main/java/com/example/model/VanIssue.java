package com.example.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "issues2")
public class VanIssue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "datetime", nullable = false)
    private LocalDateTime datetime;

    @Column(name = "vin")
    private String vin;

    @Column(name = "license_plate")
    private String licensePlate;

    @Column(name = "license_state")
    private String licenseState;

    @Column(name = "issue_region")
    private String issueRegion;

    @Column(name = "issue_description")
    private String issueDescription;
    @Column(name = "driver_id")
    private String driverID;

    public VanIssue() {}

    public VanIssue(String vin, String licensePlate, String licenseState, String issueRegion, String issueDescription, String driverId) {
        this.vin = vin;
        this.licensePlate = licensePlate;
        this.licenseState = licenseState;
        this.issueRegion = issueRegion;
        this.issueDescription = issueDescription;
        this.driverID = driverId;
        this.datetime = LocalDateTime.now();
    }

    public String getDriverId() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicenseState() {
        return licenseState;
    }

    public void setLicenseState(String licenseState) {
        this.licenseState = licenseState;
    }

    public String getIssueRegion() {
        return issueRegion;
    }

    public void setIssueRegion(String issueRegion) {
        this.issueRegion = issueRegion;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }
}

