package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomBed;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomBedEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoomBedMapper extends BaseEntityMapper<RoomBed, RoomBedEntity> {
    RoomBedMapper INSTANCE = Mappers.getMapper(RoomBedMapper.class);
}
