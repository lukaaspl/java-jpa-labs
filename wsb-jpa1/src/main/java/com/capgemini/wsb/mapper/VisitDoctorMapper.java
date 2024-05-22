package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.VisitDoctorTO;
import com.capgemini.wsb.persistence.entity.DoctorEntity;

public final class VisitDoctorMapper {

    public static VisitDoctorTO mapToTO(final DoctorEntity doctorEntity) {
        if (doctorEntity == null) {
            return null;
        }

        final VisitDoctorTO visitDoctorTO = new VisitDoctorTO();

        visitDoctorTO.setId(doctorEntity.getId());
        visitDoctorTO.setFirstName(doctorEntity.getFirstName());
        visitDoctorTO.setLastName(doctorEntity.getLastName());
        visitDoctorTO.setTelephoneNumber(doctorEntity.getTelephoneNumber());
        visitDoctorTO.setEmail(doctorEntity.getEmail());
        visitDoctorTO.setDoctorNumber(doctorEntity.getDoctorNumber());
        visitDoctorTO.setSpecialization(doctorEntity.getSpecialization());

        return visitDoctorTO;
    }

}
