package com.socoolheeya.travel.domain.rds.main.booking.mapper;

import com.socoolheeya.travel.domain.rds.common.mapper.BaseEntityMapper;
import com.socoolheeya.travel.domain.rds.main.booking.domain.BookingChildPlan;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingChildPlanEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {BookingMapper.class})
public interface BookingChildPlanMapper extends BaseEntityMapper<BookingChildPlan, BookingChildPlanEntity>  {
    BookingChildPlanMapper INSTANCE = Mappers.getMapper(BookingChildPlanMapper.class);
}
