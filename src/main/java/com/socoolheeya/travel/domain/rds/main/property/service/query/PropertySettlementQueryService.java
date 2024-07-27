package com.socoolheeya.travel.domain.rds.main.property.service.query;

import com.socoolheeya.travel.domain.rds.main.property.repository.PropertySettlementCommissionJpaRepository;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertySettlementJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PropertySettlementQueryService {

    private final PropertySettlementJpaRepository propertySettlementJpaRepository;
    private final PropertySettlementCommissionJpaRepository propertySettlementCommissionJpaRepository;

}
