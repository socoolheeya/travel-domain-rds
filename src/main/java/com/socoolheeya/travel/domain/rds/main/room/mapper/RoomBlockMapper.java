package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomBlock;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomBlockEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RoomMapper.class})
public interface RoomBlockMapper extends BaseEntityMapper<RoomBlock, RoomBlockEntity> {
    RoomBlockMapper INSTANCE = Mappers.getMapper(RoomBlockMapper.class);
}
