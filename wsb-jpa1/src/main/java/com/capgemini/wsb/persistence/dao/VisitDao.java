package com.capgemini.wsb.persistence.dao;

import java.util.List;

import com.capgemini.wsb.persistence.entity.VisitEntity;

public interface VisitDao extends Dao<VisitEntity, Long> {
    List<VisitEntity> findAllByPatientId(final Long id);
}
