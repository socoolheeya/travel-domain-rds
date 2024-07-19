package com.socoolheeya.travel.domain.rds.main.property.service.query;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyJpaRepository;
import com.socoolheeya.travel.system.core.model.param.PropertySearchCriteria;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PropertyQueryService {

    private final PropertyJpaRepository propertyJpaRepository;

    /**
     * 숙소 ID로 숙소 검색
     * @param propertyId 숙소 ID
     * @return 숙소
     */
    public Optional<PropertyEntity> searchPropertyById(Long propertyId) {
        return propertyJpaRepository.findById(propertyId);
    }

    /**
     * 숙소 ID로 숙소 엔티티 검색
     * @param propertyId 숙소 ID
     * @return 숙소 엔티티
     */
    public Optional<PropertyEntity> searchPropertyEntityById(Long propertyId) {
        return propertyJpaRepository.findById(propertyId);
    }

    /**
     * 검색 조건으로 숙소 목록 검색
     * @param searchCriteria 검색 조건
     * @param pageable 페이징
     * @return 숙소 목록
     */
    public Page<PropertyEntity> searchProperties(PropertySearchCriteria searchCriteria, Pageable pageable) {
        if (searchCriteria == null) {
            return propertyJpaRepository.findAll(pageable);
        }

        long totalCount = propertyJpaRepository.count();

        List<PropertyEntity> properties = propertyJpaRepository.getFilteredAndSortedProperties(searchCriteria, pageable);

        return new PageImpl<>(properties, PageRequest.of(pageable.getPageNumber(), properties.size()), totalCount);
    }

    public List<PropertyEntity> searchPropertiesByPropertySupplierId(Long supplierId) {
        return propertyJpaRepository.findPropertiesByPropertySupplierId(supplierId);
    }

}
