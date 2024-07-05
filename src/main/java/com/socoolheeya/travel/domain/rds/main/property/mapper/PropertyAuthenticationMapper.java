package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyAuthentication;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyAuthenticationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PropertyAuthenticationMapper extends BaseEntityMapper<PropertyAuthentication, PropertyAuthenticationEntity> {
    PropertyAuthenticationMapper INSTANCE = Mappers.getMapper(PropertyAuthenticationMapper.class);

}
