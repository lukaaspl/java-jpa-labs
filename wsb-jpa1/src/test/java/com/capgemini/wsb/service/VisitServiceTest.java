package com.capgemini.wsb.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.wsb.dto.VisitTO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VisitServiceTest {

    @Autowired
    private VisitService visitService;

    @Transactional
    @Test
    public void testShouldFindVisitsByPatientId() {
        // given
        // when
        List<VisitTO> visits = visitService.findAllByPatientId(1L);

        // then
        assertThat(visits.size()).isEqualTo(2);
    }

}
