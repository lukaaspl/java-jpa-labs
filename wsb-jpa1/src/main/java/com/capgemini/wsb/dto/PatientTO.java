package com.capgemini.wsb.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PatientTO implements Serializable {
    // #region Fields
    private Long id;

    private String firstName;

    private String lastName;

    private String telephoneNumber;

    private String email;

    private String patientNumber;

    private LocalDate dateOfBirth;

    private Boolean isInsured;

    private Set<AddressTO> addresses = new HashSet<>();

    private Set<VisitTO> visits = new HashSet<>();
    // #endregion

    // #region Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getIsInsured() {
        return isInsured;
    }

    public void setIsInsured(Boolean isInsured) {
        this.isInsured = isInsured;
    }

    public Set<AddressTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<AddressTO> addresses) {
        this.addresses = addresses;
    }

    public Set<VisitTO> getVisits() {
        return visits;
    }

    public void setVisits(Set<VisitTO> visits) {
        this.visits = visits;
    }
    // #endregion
}