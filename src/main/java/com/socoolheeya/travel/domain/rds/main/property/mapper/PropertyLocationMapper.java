package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyLocation;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyLocationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PropertyLocationMapper extends BaseEntityMapper<PropertyLocation, PropertyLocationEntity> {
    PropertyLocationMapper INSTANCE = Mappers.getMapper(PropertyLocationMapper.class);
}
