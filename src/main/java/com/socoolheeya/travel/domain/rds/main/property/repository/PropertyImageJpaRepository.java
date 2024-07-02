package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyImageJpaRepository extends JpaRepository<PropertyImageEntity, Long> {

    List<PropertyImageEntity> findByPropertyId(Long propertyId);

    void deleteByPropertyId(Long propertyId);
}
