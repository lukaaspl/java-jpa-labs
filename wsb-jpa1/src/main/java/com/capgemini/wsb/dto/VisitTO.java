package com.capgemini.wsb.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class VisitTO implements Serializable {
    // #region Fields
    private Long id;

    private String description;

    private LocalDateTime time;

    private VisitPatientTO patient;

    private VisitDoctorTO doctor;
    // //#endregion

    // #region Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public VisitPatientTO getPatient() {
        return patient;
    }

    public void setPatient(VisitPatientTO patient) {
        this.patient = patient;
    }

    public VisitDoctorTO getDoctor() {
        return doctor;
    }

    public void setDoctor(VisitDoctorTO doctor) {
        this.doctor = doctor;
    }
    // #endregion
}
