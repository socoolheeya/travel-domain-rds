package com.socoolheeya.travel.domain.rds.main.property.service.query;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyAddressEntity;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyAddressJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PropertyAddressQueryService {

    private final PropertyAddressJpaRepository propertyAddressJpaRepository;

    public Optional<PropertyAddressEntity> searchByPropertyId(Long id) {
        return propertyAddressJpaRepository.findById(id);
    }
}
