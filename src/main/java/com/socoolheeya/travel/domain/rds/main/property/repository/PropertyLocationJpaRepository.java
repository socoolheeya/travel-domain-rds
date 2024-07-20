package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyLocationEntity;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PropertyLocationJpaRepository extends JpaRepository<PropertyLocationEntity, Long> {

    @Override
    @Query("SELECT pl FROM PropertyLocationEntity pl JOIN FETCH pl.property p WHERE pl.id = :id")
    Optional<PropertyLocationEntity> findById(@NonNull Long id);

    @Query("SELECT pl FROM PropertyLocationEntity pl JOIN FETCH pl.property p WHERE p.id = :propertyId")
    Optional<PropertyLocationEntity> findByPropertyId(Long propertyId);


}
