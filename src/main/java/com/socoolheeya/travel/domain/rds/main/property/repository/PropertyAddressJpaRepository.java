package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PropertyAddressJpaRepository extends JpaRepository<PropertyAddressEntity, Long> {

    @Query("SELECT pa FROM PropertyAddressEntity pa JOIN FETCH pa.property p WHERE p.id = :id")
    Optional<PropertyAddressEntity> findById(Long id);
}
