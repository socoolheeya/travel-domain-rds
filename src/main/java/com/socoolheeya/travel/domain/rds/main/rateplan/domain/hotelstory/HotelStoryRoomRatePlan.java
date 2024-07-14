package com.socoolheeya.travel.domain.rds.main.rateplan.domain.hotelstory;

public record HotelStoryRoomRatePlan(
        Long roomId,
        Long ratePlanId,
        String roomName,
        String ratePlanName,
        Integer minAdult,
        Integer totalPax,
        Boolean isRoomAvailable,
        Boolean isRatePlanAvailable,
        Boolean isRoomRatePlanAvailable
) {
}
