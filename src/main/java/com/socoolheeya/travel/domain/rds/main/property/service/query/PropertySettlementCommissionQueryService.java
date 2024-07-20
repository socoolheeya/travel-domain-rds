package com.socoolheeya.travel.domain.rds.main.property.service.query;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertySettlementCommission;
import com.socoolheeya.travel.domain.rds.main.property.mapper.PropertySettlementCommissionMapper;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertySettlementCommissionJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PropertySettlementCommissionQueryService {

    private final PropertySettlementCommissionJpaRepository propertySettlementCommissionJpaRepository;

    public Optional<PropertySettlementCommission> findByPropertyId(Long propertyId) {
        return propertySettlementCommissionJpaRepository.findByPropertyId(propertyId)
                .map(PropertySettlementCommissionMapper.INSTANCE::toDomain);
    }
}
