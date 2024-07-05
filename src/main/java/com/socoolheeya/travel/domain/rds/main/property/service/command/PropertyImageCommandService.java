package com.socoolheeya.travel.domain.rds.main.property.service.command;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyImage;
import com.socoolheeya.travel.domain.rds.main.property.mapper.PropertyImageMapper;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyImageJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PropertyImageCommandService {

    private final PropertyImageJpaRepository propertyImageJpaRepository;

    @Transactional
    public void deleteByPropertyId(Long propertyId) {
        propertyImageJpaRepository.deleteByPropertyId(propertyId);
    }

    @Transactional
    public void updatePropertyImage(PropertyImage propertyImage) {
        propertyImageJpaRepository.save(PropertyImageMapper.INSTANCE.toEntity(propertyImage));
    }

}
