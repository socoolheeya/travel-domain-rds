package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomChildrenOccupancy;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomChildrenOccupancyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoomChildrenOccupancyMapper extends BaseEntityMapper<RoomChildrenOccupancy, RoomChildrenOccupancyEntity> {
    RoomChildrenOccupancyMapper INSTANCE = Mappers.getMapper(RoomChildrenOccupancyMapper.class);
}
