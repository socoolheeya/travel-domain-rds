package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertySettlementCommissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertySettlementCommissionJpaRepository extends JpaRepository<PropertySettlementCommissionEntity, Long> {
}
