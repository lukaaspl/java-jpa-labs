package com.capgemini.wsb.persistence.dao;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.wsb.persistence.entity.PatientEntity;

// given
// when
// then

// patientDao.findAllByLastName("Nowak")

// assertThat(patientDao.findAllByLastName("Nowak")).isNotNull();

// assertThat(patientDao.findAllByLastName("Nowak").size()).isEqualTo(1);

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDaoTest {
    @Autowired
    private PatientDao patientDao;

    @Transactional
    @Test
    public void testShouldFindPatientsByLastName() {
        // given
        // when
        List<PatientEntity> patients = patientDao.findAllByLastName("Nowak");

        // then
        assertThat(patients.size()).isEqualTo(2);
        assertThat(patients.stream().allMatch(p -> p.getLastName().equals("Nowak"))).isTrue();
    }

    @Transactional
    @Test
    public void testShouldFindPatientsByVisitsCountGreaterThan() {
        // given
        // when
        List<PatientEntity> patientsWithAtLeastOneVisit = patientDao.findAllByVisitsCountGreaterThan(1);

        // then
        assertThat(patientsWithAtLeastOneVisit.size()).isEqualTo(1);
        assertThat(patientsWithAtLeastOneVisit.stream().allMatch(p -> p.getVisits().size() > 1)).isTrue();

        // given
        // when
        List<PatientEntity> patientsWithAtLeastTwoVisits = patientDao.findAllByVisitsCountGreaterThan(2);

        // then
        assertThat(patientsWithAtLeastTwoVisits.size()).isEqualTo(0);
    }

    @Transactional
    @Test
    public void testShouldFindAllInsuredPatients() {
        // given
        // when
        List<PatientEntity> insuredPatients = patientDao.findAllInsured();

        // then
        assertThat(insuredPatients.size()).isEqualTo(2);
        assertThat(insuredPatients.stream().allMatch(PatientEntity::getIsInsured)).isTrue();
    }
}
