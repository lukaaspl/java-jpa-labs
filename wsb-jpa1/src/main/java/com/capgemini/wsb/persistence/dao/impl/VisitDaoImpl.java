package com.capgemini.wsb.persistence.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.wsb.persistence.dao.VisitDao;
import com.capgemini.wsb.persistence.entity.VisitEntity;

@Repository
public class VisitDaoImpl extends AbstractDao<VisitEntity, Long> implements VisitDao {

    @Override
    public List<VisitEntity> findAllByPatientId(Long patientId) {
        return this.entityManager.createQuery(
                "SELECT v FROM VisitEntity v WHERE v.patient.id = :patientId", VisitEntity.class)
                .setParameter("patientId", patientId).getResultList();
    }
}
