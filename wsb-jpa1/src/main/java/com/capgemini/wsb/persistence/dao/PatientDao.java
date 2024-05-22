package com.capgemini.wsb.persistence.dao;

import java.util.List;

import com.capgemini.wsb.persistence.entity.PatientEntity;

public interface PatientDao extends Dao<PatientEntity, Long> {
    List<PatientEntity> findAllByLastName(final String lastName);

    List<PatientEntity> findAllByVisitsCountGreaterThan(final int count);

    List<PatientEntity> findAllInsured();
}
