package com.socoolheeya.travel.domain.rds.main.property.service.command;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyAuthenticationEntity;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyAuthenticationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PropertyAuthenticationCommandService {

    private final PropertyAuthenticationJpaRepository propertyAuthenticationJpaRepository;

    @Transactional
    public void save(PropertyAuthenticationEntity entity) {
        propertyAuthenticationJpaRepository.save(entity);
    }
}
