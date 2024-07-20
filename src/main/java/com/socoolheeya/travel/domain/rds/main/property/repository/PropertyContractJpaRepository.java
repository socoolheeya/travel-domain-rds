package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyContractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyContractJpaRepository extends JpaRepository<PropertyContractEntity, Long> {

    @Query("SELECT pc FROM PropertyContractEntity pc JOIN FETCH pc.property p WHERE p.id = :propertyId")
    List<PropertyContractEntity> findByPropertyId(Long propertyId);
}
