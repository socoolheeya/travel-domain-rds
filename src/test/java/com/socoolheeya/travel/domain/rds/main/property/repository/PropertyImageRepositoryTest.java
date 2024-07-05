package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.configuration.MainDatasourceConfiguration;
import com.socoolheeya.travel.domain.rds.configuration.QueryDslConfiguration;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyImageEntity;
import com.socoolheeya.travel.system.core.enums.PropertyEnums.ImageType;
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
import org.springframework.util.StopWatch;

import javax.sql.DataSource;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import(value = {MainDatasourceConfiguration.class, QueryDslConfiguration.class})
class PropertyImageRepositoryTest {

    @Autowired
    private DataSource mainDataSource;

    @Autowired
    PropertyImageJpaRepository propertyImageJpaRepository;

    @Autowired
    PropertyJpaRepository propertyJpaRepository;

    @Autowired
    private EntityManager em;

    @Test
    @Transactional
    @Rollback(false)
    void saveAllTest() {
        StopWatch watch = new StopWatch();
        watch.start();
        PropertyEntity entity = propertyJpaRepository.findById(1L)
                .orElseThrow(() -> new NoSuchElementException("PropertyEntity not found"));
        IntStream.range(0, 10)
                .mapToObj(i -> new PropertyImageEntity(null, "image_" + i + ".jpg", ImageType.MAIN,
                        "test/image_" + i + ".jpg", i + 1, entity))
                .collect(Collectors.collectingAndThen(Collectors.toList(), propertyImageJpaRepository::saveAll));

        watch.stop();
        System.out.println("saveAllTest execution time:" + watch.getTotalTimeMillis());

        List<PropertyImageEntity> propertyImageEntities = propertyImageJpaRepository.findByPropertyId(1L);
        Assertions.assertNotNull(propertyImageEntities, "PropertyImageEntity list is null");
    }
}
