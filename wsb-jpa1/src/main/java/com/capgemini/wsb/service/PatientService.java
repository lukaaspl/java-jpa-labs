package com.capgemini.wsb.service;

import java.util.List;

import com.capgemini.wsb.dto.PatientTO;

public interface PatientService {
    public PatientTO findById(final Long id);

    public List<PatientTO> findAll();

    public Long count();

    public void delete(final Long id);
}
