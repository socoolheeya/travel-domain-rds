package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.configuration.QueryDslConfiguration;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyAuthenticationEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.NoSuchElementException;
import java.util.Optional;

@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(value = {QueryDslConfiguration.class})
class PropertyAuthenticationJpaRepositoryTest {

    @Autowired
    private DataSource mainDataSource;

    @Autowired
    PropertyAuthenticationJpaRepository propertyAuthenticationJpaRepository;

    @Autowired
    PropertyJpaRepository propertyJpaRepository;

    @Autowired
    private EntityManager em;

    @Test
    @Transactional
    @Rollback
    void insertTest() {
        PropertyEntity propertyEntity = propertyJpaRepository.findById(5L)
                .orElseThrow(() -> new NoSuchElementException("PropertyEntity not found"));
        PropertyAuthenticationEntity propertyAuthentication = new PropertyAuthenticationEntity(null, "banana", "tree1234", propertyEntity);
        PropertyAuthenticationEntity saved = propertyAuthenticationJpaRepository.save(propertyAuthentication);

        Assertions.assertNotNull(saved.getId(), "PropertyAuthenticationEntity id is null");
    }


    @Test
    void searchPropertyAuthenticationTest() {
        Optional<PropertyAuthenticationEntity> optional = propertyAuthenticationJpaRepository.findById(3L);
        if (optional.isPresent()) {
            PropertyAuthenticationEntity propertyAuthenticationEntity = optional.get();
            Assertions.assertNotNull(propertyAuthenticationEntity, "PropertyAuthenticationEntity is null");
        } else {
            Assertions.fail("PropertyAuthenticationEntity not found");
        }
    }


}
