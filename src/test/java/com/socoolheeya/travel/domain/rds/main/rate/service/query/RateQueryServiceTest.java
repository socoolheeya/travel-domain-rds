package com.socoolheeya.travel.domain.rds.main.rate.service.query;

import com.socoolheeya.travel.domain.rds.main.rate.repository.RateJpaRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class RateQueryServiceTest {

    @Autowired
    private EntityManager em;

    @Autowired
    private RateQueryService rateQueryService;

    @Autowired
    private RateJpaRepository rateJpaRepository;

}