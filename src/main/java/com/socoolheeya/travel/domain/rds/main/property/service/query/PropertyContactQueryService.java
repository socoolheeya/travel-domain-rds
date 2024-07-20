package com.socoolheeya.travel.domain.rds.main.property.service.query;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyContactEntity;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyContactJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PropertyContactQueryService {

    private final PropertyContactJpaRepository propertyContactJpaRepository;

    public Optional<PropertyContactEntity> searchById(Long id) {
        return propertyContactJpaRepository.findById(id);
    }
}
