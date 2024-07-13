package com.socoolheeya.travel.domain.rds.main.rateplan.domain.hotelstory;

public record HotelstoryRatePlan(
        Long roomTypeId,
        Long ratePlanId,
        String ratePlanName,
        String mealCode,
        String priceType
) {

}
