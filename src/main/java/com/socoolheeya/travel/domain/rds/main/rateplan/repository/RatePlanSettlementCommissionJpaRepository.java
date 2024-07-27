package com.socoolheeya.travel.domain.rds.main.rateplan.repository;

import com.socoolheeya.travel.domain.rds.main.rateplan.entity.RatePlanSettlementCommissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RatePlanSettlementCommissionJpaRepository extends JpaRepository<RatePlanSettlementCommissionEntity, Long> {

    @Query("SELECT c FROM RatePlanSettlementCommissionEntity c " +
            "JOIN FETCH c.ratePlan " +
            "WHERE c.ratePlan.id = :ratePlanId")
    Optional<RatePlanSettlementCommissionEntity> findByRatePlanId(Long ratePlanId);

}
