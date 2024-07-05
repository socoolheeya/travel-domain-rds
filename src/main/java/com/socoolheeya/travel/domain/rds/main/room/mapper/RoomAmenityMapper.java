package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomAmenity;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomAmenityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RoomMapper.class})
public interface RoomAmenityMapper extends BaseEntityMapper<RoomAmenity, RoomAmenityEntity> {
    RoomAmenityMapper INSTANCE = Mappers.getMapper(RoomAmenityMapper.class);
}
