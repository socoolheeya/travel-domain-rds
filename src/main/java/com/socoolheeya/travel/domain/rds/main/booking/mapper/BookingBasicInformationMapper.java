package com.socoolheeya.travel.domain.rds.main.booking.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.booking.domain.BookingBasicInformation;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingBasicInformationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {BookingMapper.class})
public interface BookingBasicInformationMapper extends BaseEntityMapper<BookingBasicInformation, BookingBasicInformationEntity> {
    BookingBasicInformationMapper INSTANCE = Mappers.getMapper(BookingBasicInformationMapper.class);
}
