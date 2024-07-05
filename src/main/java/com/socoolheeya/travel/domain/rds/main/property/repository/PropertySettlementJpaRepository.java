package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertySettlementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertySettlementJpaRepository extends JpaRepository<PropertySettlementEntity, Long> {
}
