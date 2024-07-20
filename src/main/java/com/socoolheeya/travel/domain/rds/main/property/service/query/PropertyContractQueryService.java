package com.socoolheeya.travel.domain.rds.main.property.service.query;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyContract;
import com.socoolheeya.travel.domain.rds.main.property.mapper.PropertyContractMapper;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyContractJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PropertyContractQueryService {

    private final PropertyContractJpaRepository propertyContractJpaRepository;

    public List<PropertyContract> searchByPropertyId(Long propertyId) {
        return propertyContractJpaRepository.findByPropertyId(propertyId)
                .stream()
                .map(PropertyContractMapper.INSTANCE::toDomain)
                .toList();
    }
}
