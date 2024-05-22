package com.capgemini.wsb.persistence.entity;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VISIT")
public class VisitEntity {
	// #region Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private LocalDateTime time;

	// many-to-one relationship (child, bidirectional)
	@ManyToOne
	@JoinColumn(name = "DOCTOR_ID")
	private DoctorEntity doctor;

	// many-to-one relationship (child, bidirectional)
	@ManyToOne
	@JoinColumn(name = "PATIENT_ID")
	private PatientEntity patient;

	// 1-to-many relationship (parent, unidirectional)
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "VISIT_ID")
	private Set<MedicalTreatmentEntity> medicalTreatments;
	// #endregion

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
	// #endregion
}
