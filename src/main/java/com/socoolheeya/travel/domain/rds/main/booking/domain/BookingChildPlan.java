package com.socoolheeya.travel.domain.rds.main.booking.domain;

public record BookingChildPlan(
        Long id,
        String name,
        Integer age,
        BookingOccupancy occupancy
) {
}
