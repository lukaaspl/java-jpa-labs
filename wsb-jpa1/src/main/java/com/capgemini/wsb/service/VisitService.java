package com.capgemini.wsb.service;

import java.util.List;

import com.capgemini.wsb.dto.VisitTO;

public interface VisitService {
    public VisitTO findById(final Long id);

    public List<VisitTO> findAllByPatientId(final Long id);
}
