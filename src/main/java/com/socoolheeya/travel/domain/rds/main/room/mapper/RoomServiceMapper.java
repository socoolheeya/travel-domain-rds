package com.socoolheeya.travel.domain.rds.main.room.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {RoomMapper.class})
public interface RoomServiceMapper {
    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);
}
