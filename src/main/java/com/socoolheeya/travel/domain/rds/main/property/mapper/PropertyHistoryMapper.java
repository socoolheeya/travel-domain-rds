package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyHistory;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyHistoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PropertyHistoryMapper extends BaseEntityMapper<PropertyHistory, PropertyHistoryEntity> {
    PropertyHistoryMapper INSTANCE = Mappers.getMapper(PropertyHistoryMapper.class);
}
