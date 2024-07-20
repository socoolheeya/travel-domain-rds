package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertySettlementCommissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PropertySettlementCommissionJpaRepository extends JpaRepository<PropertySettlementCommissionEntity, Long> {

    @Query("SELECT psc FROM PropertySettlementCommissionEntity psc JOIN FETCH psc.propertySettlement ps JOIN FETCH ps.property p WHERE p.id = :propertyId")
    Optional<PropertySettlementCommissionEntity> findByPropertyId(Long propertyId);
}
