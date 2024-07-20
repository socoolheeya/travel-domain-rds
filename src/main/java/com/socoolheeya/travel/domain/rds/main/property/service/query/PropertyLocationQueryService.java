package com.socoolheeya.travel.domain.rds.main.property.service.query;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyLocation;
import com.socoolheeya.travel.domain.rds.main.property.mapper.PropertyLocationMapper;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyLocationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PropertyLocationQueryService {

    private final PropertyLocationJpaRepository propertyLocationJpaRepository;

    public Optional<PropertyLocation> searchByPropertyId(Long id) {
        return propertyLocationJpaRepository.findById(id)
                .map(PropertyLocationMapper.INSTANCE::toDomain);
    }
}
