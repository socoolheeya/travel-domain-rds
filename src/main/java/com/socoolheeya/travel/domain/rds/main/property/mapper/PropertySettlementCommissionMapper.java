package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertySettlementCommission;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertySettlementCommissionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PropertySettlementCommissionMapper extends BaseEntityMapper<PropertySettlementCommission, PropertySettlementCommissionEntity> {
    PropertySettlementCommissionMapper INSTANCE = Mappers.getMapper(PropertySettlementCommissionMapper.class);
}
