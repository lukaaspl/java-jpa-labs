package com.capgemini.wsb.mapper;

import java.util.stream.Collectors;

import com.capgemini.wsb.dto.DoctorTO;
import com.capgemini.wsb.persistence.entity.DoctorEntity;

public final class DoctorMapper {

    public static DoctorTO mapToTO(final DoctorEntity doctorEntity) {
        if (doctorEntity == null) {
            return null;
        }

        final DoctorTO doctorTO = new DoctorTO();

        doctorTO.setId(doctorEntity.getId());
        doctorTO.setFirstName(doctorEntity.getFirstName());
        doctorTO.setLastName(doctorEntity.getLastName());
        doctorTO.setTelephoneNumber(doctorEntity.getTelephoneNumber());
        doctorTO.setEmail(doctorEntity.getEmail());
        doctorTO.setDoctorNumber(doctorEntity.getDoctorNumber());
        doctorTO.setSpecialization(doctorEntity.getSpecialization());
        doctorTO.setAddresses(
                doctorEntity.getAddresses().stream().map(AddressMapper::mapToTO).collect(Collectors.toSet()));
        doctorTO.setVisits(
                doctorEntity.getVisits().stream().map(VisitMapper::mapToTO).collect(Collectors.toSet()));

        return doctorTO;
    }

}
