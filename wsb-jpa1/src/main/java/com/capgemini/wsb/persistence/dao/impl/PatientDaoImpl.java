package com.capgemini.wsb.persistence.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {

    @Override
    public List<PatientEntity> findAllByLastName(String lastName) {
        return this.entityManager
                .createQuery("SELECT p FROM PatientEntity p WHERE p.lastName = :lastName", PatientEntity.class)
                .setParameter("lastName", lastName)
                .getResultList();
    }

    @Override
    public List<PatientEntity> findAllByVisitsCountGreaterThan(int count) {
        return this.entityManager
                .createQuery("SELECT p FROM PatientEntity p WHERE SIZE(p.visits) > :count", PatientEntity.class)
                .setParameter("count", count)
                .getResultList();
    }

    @Override
    public List<PatientEntity> findAllInsured() {
        return this.entityManager
                .createQuery("SELECT p FROM PatientEntity p WHERE p.isInsured = true", PatientEntity.class)
                .getResultList();
    }

}
