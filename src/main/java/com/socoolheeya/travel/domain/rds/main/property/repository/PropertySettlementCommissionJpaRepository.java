package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertySettlementCommissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PropertySettlementCommissionJpaRepository extends JpaRepository<PropertySettlementCommissionEntity, Long> {

    @Query("SELECT c FROM PropertySettlementCommissionEntity c " +
            "JOIN FETCH c.propertySettlement " +
            "JOIN FETCH c.propertySettlement.property " +
            "WHERE c.propertySettlement.property.id = :propertyId")
    Optional<PropertySettlementCommissionEntity> findByPropertyId(Long propertyId);
}
