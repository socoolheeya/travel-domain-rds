package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PropertyHistoryJpaRepository extends JpaRepository<PropertyHistoryEntity, Long> {

    @Query("SELECT p FROM PropertyHistoryEntity p WHERE p.propertyId = :propertyId ORDER BY p.id DESC")
    Optional<PropertyHistoryEntity> findTopByPropertyIdOrderByIdDesc(Long propertyId);


}
