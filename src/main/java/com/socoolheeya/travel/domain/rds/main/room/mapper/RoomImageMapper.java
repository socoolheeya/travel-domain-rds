package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomImage;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomImageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE
        , uses = {RoomMapper.class})
public interface RoomImageMapper extends BaseEntityMapper<RoomImage, RoomImageEntity> {
    RoomImageMapper INSTANCE = Mappers.getMapper(RoomImageMapper.class);
}
