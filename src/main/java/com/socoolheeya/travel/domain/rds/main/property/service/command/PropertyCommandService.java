package com.socoolheeya.travel.domain.rds.main.property.service.command;

import com.socoolheeya.travel.domain.rds.main.property.domain.Property;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import com.socoolheeya.travel.domain.rds.main.property.mapper.PropertyMapper;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PropertyCommandService {

    private final PropertyJpaRepository propertyJpaRepository;

    @Transactional
    public PropertyEntity saveProperty(Property property) {
        return propertyJpaRepository.save(PropertyMapper.INSTANCE.toEntity(property));
    }

    @Transactional
    public void removeProperty(Long propertyId) {
        propertyJpaRepository.findById(propertyId)
                .ifPresent(PropertyEntity::inActive);
    }

}
