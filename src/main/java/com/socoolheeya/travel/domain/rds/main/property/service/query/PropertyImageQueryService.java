package com.socoolheeya.travel.domain.rds.main.property.service.query;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyImageEntity;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyImageJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PropertyImageQueryService {
    private final PropertyImageJpaRepository propertyImageJpaRepository;

    public List<PropertyImageEntity> findByPropertyId(Long propertyId) {
        return propertyImageJpaRepository.findByPropertyId(propertyId);
    }
}
