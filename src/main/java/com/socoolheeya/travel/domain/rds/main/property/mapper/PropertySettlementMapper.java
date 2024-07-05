package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertySettlement;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertySettlementEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PropertySettlementMapper extends BaseEntityMapper<PropertySettlement, PropertySettlementEntity> {
    PropertySettlementMapper INSTANCE = Mappers.getMapper(PropertySettlementMapper.class);
}
