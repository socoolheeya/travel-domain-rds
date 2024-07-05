package com.socoolheeya.travel.domain.rds.main.room.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.room.domain.RoomDetail;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomDetailEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RoomDetailMapper extends BaseEntityMapper<RoomDetail, RoomDetailEntity> {
    RoomDetailMapper INSTANCE = Mappers.getMapper(RoomDetailMapper.class);
}
