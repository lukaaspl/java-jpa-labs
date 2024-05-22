package com.capgemini.wsb.service;

import static org.assertj.core.api.Assertions.assertThat;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.wsb.dto.PatientTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceTest {
    @Autowired
    private PatientService patientService;

    @Autowired
    private VisitService visitService;

    @Autowired
    private DoctorService doctorService;

    @Test
    public void testShouldFindPatientById() {
        // given
        // when
        PatientTO patientTO = patientService.findById(1L);
        // then
        assertThat(patientTO).isNotNull();
        assertThat(patientTO.getFirstName()).isEqualTo("Adam");
        assertThat(patientTO.getLastName()).isEqualTo("Nowak");
        assertThat(patientTO.getTelephoneNumber()).isEqualTo("902313541");
        assertThat(patientTO.getEmail()).isEqualTo("adam.nowak@example.com");
        assertThat(patientTO.getPatientNumber()).isEqualTo("313412250");
        assertThat(patientTO.getDateOfBirth()).isEqualTo("1990-01-01");
        assertThat(patientTO.getIsInsured()).isEqualTo(true);
    }

    @Transactional
    @Test
    public void testShouldRemovePatient() {
        // given
        Long entitiesNumBefore = patientService.count();
        // when
        patientService.delete(1L);
        // then
        assertThat(patientService.findById(1L)).isNull();
        assertThat(patientService.count()).isEqualTo(entitiesNumBefore - 1);

    }

    @Transactional
    @Test
    public void testShouldRemoveAllRelatedVisitsOncePatientIsRemoved() {
        // given
        int visitsNumBefore = visitService.findAllByPatientId(1L).size();

        // then
        assertThat(visitsNumBefore).isEqualTo(2);

        // when
        patientService.delete(1L);

        // then
        assertThat(visitService.findAllByPatientId(1L).size()).isEqualTo(0);
    }

    @Transactional
    @Test
    public void testShouldKeepDoctorsRelatedToVisitsOncePatientIsRemoved() {
        // given
        Long visitDoctorId = visitService.findById(1L).getDoctor().getId();

        // when
        patientService.delete(1L);

        // then
        assertThat(doctorService.findById(visitDoctorId)).isNotNull();

    }
}
