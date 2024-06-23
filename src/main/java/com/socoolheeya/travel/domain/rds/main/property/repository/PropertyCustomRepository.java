package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import com.socoolheeya.travel.system.core.model.param.PropertySearchCriteria;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PropertyCustomRepository {

    List<PropertyEntity> getFilteredAndSortedProperties(PropertySearchCriteria searchCriteria, Pageable pageable);
}
