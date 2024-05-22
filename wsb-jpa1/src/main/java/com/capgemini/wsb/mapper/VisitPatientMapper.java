package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.VisitPatientTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;

public final class VisitPatientMapper {

    public static VisitPatientTO mapToTO(final PatientEntity patientEntity) {
        if (patientEntity == null) {
            return null;
        }

        final VisitPatientTO visitPatientTO = new VisitPatientTO();

        visitPatientTO.setId(patientEntity.getId());
        visitPatientTO.setFirstName(patientEntity.getFirstName());
        visitPatientTO.setLastName(patientEntity.getLastName());
        visitPatientTO.setTelephoneNumber(patientEntity.getTelephoneNumber());
        visitPatientTO.setEmail(patientEntity.getEmail());
        visitPatientTO.setPatientNumber(patientEntity.getPatientNumber());
        visitPatientTO.setDateOfBirth(patientEntity.getDateOfBirth());
        visitPatientTO.setIsInsured(patientEntity.getIsInsured());

        return visitPatientTO;
    }

}
