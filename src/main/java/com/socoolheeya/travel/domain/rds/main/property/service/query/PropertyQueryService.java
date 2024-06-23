package com.socoolheeya.travel.domain.rds.main.property.service.query;

import com.socoolheeya.travel.domain.rds.main.property.domain.Property;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import com.socoolheeya.travel.domain.rds.main.property.mapper.PropertyMapper;
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
import java.util.stream.Collectors;

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
    public Optional<Property> searchPropertyById(Long propertyId) {
        return propertyJpaRepository.findById(propertyId)
                .map(PropertyMapper.INSTANCE::toDomain);
    }

    /**
     * 검색 조건으로 숙소 목록 검색
     * @param searchCriteria 검색 조건
     * @param pageable 페이징
     * @return 숙소 목록
     */
    public Page<Property> searchProperties(PropertySearchCriteria searchCriteria, Pageable pageable) {
        if (searchCriteria == null) {
            return propertyJpaRepository.findAll(pageable)
                    .map(PropertyMapper.INSTANCE::toDomain);
        }

        long totalCount = propertyJpaRepository.count();

        List<Property> properties = propertyJpaRepository.getFilteredAndSortedProperties(searchCriteria, pageable)
                .stream()
                .map(PropertyMapper.INSTANCE::toDomain)
                .toList();

        return new PageImpl<>(properties, PageRequest.of(pageable.getPageNumber(), properties.size()), totalCount);
    }

}
