package com.socoolheeya.travel.domain.rds.main.property.service.query;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyHistory;
import com.socoolheeya.travel.domain.rds.main.property.mapper.PropertyHistoryMapper;
import com.socoolheeya.travel.domain.rds.main.property.repository.PropertyHistoryJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class PropertyHistoryQueryService {
    private final PropertyHistoryJpaRepository propertyHistoryJpaRepository;

    private final PropertyHistoryMapper propertyHistoryMapper;

    public Optional<PropertyHistory> getLatestPropertyHistory(Long propertyId) {
        return propertyHistoryJpaRepository.findTopByPropertyIdOrderByIdDesc(propertyId)
                .map(PropertyHistoryMapper.INSTANCE::toDomain);

    }

    public Optional<PropertyHistory> getPropertyHistory(Long id) {
        return propertyHistoryJpaRepository.findById(id)
                .map(PropertyHistoryMapper.INSTANCE::toDomain);
    }
}
